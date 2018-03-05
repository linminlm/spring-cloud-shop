package com.lintc.shop;

import com.lintc.shop.config.RootConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableCircuitBreaker // 开启断路器功能
@EnableDiscoveryClient
@Import(RootConfig.class)
public class HomeShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeShopApplication.class, args);
	}

}
