package com.xyz66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者
 *
 */
@SpringBootApplication
@EnableFeignClients//扫描对应的feign client
public class ConsumerApp
{
    public static void main( String[] args )
    {
        System.out.println( "服务消费者" );
        SpringApplication.run(ConsumerApp.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
