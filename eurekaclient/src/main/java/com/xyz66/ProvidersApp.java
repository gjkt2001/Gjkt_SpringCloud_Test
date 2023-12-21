package com.xyz66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务提供者
 *
 */
@SpringBootApplication
public class ProvidersApp
{
    public static void main( String[] args )
    {
        System.out.println( "服务提供者。" );
        SpringApplication.run(ProvidersApp.class,args);
    }
}
