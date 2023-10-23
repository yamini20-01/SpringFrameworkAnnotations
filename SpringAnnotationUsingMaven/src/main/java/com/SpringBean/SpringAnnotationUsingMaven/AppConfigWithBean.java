package com.SpringBean.SpringAnnotationUsingMaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigWithBean {
//Without using Bean Notation using @ComponentScan(basePackages="package name")	
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}	@Bean
	public Snapdragon getProcessor() {
		return new Snapdragon();
	}	
}
