package com.v.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v.properties.MyProperties;

@RestController
public class CustomController {
	
	@Autowired
	private MyProperties properties;

	@GetMapping("/")
	public String getData() {
		return properties.getProperty1();
	}
}
