package com.lintc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PubUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PubUserServiceApplication.class, args);
	}
}
