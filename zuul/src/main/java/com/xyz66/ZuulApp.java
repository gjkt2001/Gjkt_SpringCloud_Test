package com.xyz66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关Zuul
 *
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApp
{
    public static void main( String[] args )
    {
        System.out.println( "服务网关" );
        SpringApplication.run(ZuulApp.class,args);
    }
}
