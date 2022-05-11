package com.cg.cloudalibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextBean {
    @Bean
//    开启@LoadBalanced注解，不然restTemplate调用时会无法访问
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
