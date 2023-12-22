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
public class ConsumerApp8021
{
    public static void main( String[] args )
    {
        SpringApplication.run( ConsumerApp8021.class, args );
    }
}
