package com.hearst.csms.frm.swagger.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ConditionalOnProperty("swagger.enabled")
public class SwaggerConfig {

	@Autowired
	SwaggerProperties swaggerProperties;

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(swaggerProperties.getTitle()).description(swaggerProperties.getDescription())
				.termsOfServiceUrl(swaggerProperties.getTermsOfServiceUrl()).license(swaggerProperties.getLicense())
				.licenseUrl(swaggerProperties.getLicenseUrl()).contact(new Contact(swaggerProperties.getContactName(),
						swaggerProperties.getContactUrl(), swaggerProperties.getContactEmail()))
				.build();
	}

}