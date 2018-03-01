package com.lintc.shop.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/2/27
 * @公司：汽车易生活
 */
@Configuration
public class RootConfig {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
