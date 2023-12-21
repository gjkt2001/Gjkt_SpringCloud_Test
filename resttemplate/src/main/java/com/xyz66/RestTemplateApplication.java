package com.xyz66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }

    /**
     * 创建RestTemplate对象
     * @return RestTemplate对象
     */
    @Bean// 添加到ioc容器里面
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
