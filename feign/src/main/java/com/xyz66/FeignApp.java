package com.xyz66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableFeignClients
public class FeignApp
{
    public static void main( String[] args )
    {
        System.out.println( "Feign" );
        SpringApplication.run( FeignApp.class, args);
    }
}
