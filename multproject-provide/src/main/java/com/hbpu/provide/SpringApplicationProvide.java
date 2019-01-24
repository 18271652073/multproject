package com.hbpu.provide;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @date 2018/9/21.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringApplicationProvide {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringApplicationProvide.class).web(true).run(args);
//        SpringApplication.run(SpringApplicationProvide.class, args);
    }
}
