package com.security1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecurityDemo {

	@GetMapping
	public String SaySomeThing() {
		
		return "This is Spring Security demo application........";
	}
}
