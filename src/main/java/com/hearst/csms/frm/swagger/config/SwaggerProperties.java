package com.hearst.csms.frm.swagger.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource("classpath:swagger.properties")
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

	private String title;
	private String description;
	private String version;
	private String termsOfServiceUrl;
	private String license;
	private String licenseUrl;

	private String contactName;
	private String contactUrl;
	private String contactEmail;

}