package com.xyz66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心启动类
 */

@SpringBootApplication// SpringBoot服务入口
@EnableEurekaServer// 声明是一个注册中心-微服务，提供服务注册与发现功能
public class EurekaServerApplication
{
    public static void main( String[] args )
    {
        // springboot搭建工程，SpringCloud让它成为某个组件。
        System.out.println( "注册中心。" );
        SpringApplication.run(EurekaServerApplication.class,args);

    }
}
