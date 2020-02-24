package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/")
	public String welcomeMessage() {
		return "Welcome to Spring Security";
	}
	
	
	@GetMapping("/user")
	public String user() {
		return "Welcome to Student Page";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Welcome to Admin Page";
	}
	
}
