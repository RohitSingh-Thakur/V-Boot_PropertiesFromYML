package com.v.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyProperties {

	@Value("${app.firstname}")
	private String property1;

	public String getProperty1() {
		return property1;
	}

}
