package com.ace.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.ace.security.entity")
public class SpringDaoBaseSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDaoBaseSecurityApplication.class, args);
	}

}
