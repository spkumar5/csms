package com.hearst.csms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("private")
	String privateMethod() {
		return "private";
	}

	@GetMapping("public")
	String publicMethod() {
		return "public";
	}

	@GetMapping("admin")
	String adminMethod() {
		return "admin";
	}

}
