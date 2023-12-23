package com.xyz66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 */
@SpringBootApplication
public class RibbonApp {
    public static void main(String[] args) {
        System.out.println("Ribbon负载均衡！");
        SpringApplication.run(RibbonApp.class, args);
    }

    @Bean
    @LoadBalanced// 声明一个基于Ribbon负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
