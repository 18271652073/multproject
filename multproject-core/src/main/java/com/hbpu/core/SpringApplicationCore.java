package com.hbpu.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 * @date 2018/9/21.
 */

@SpringBootApplication
@EnableEurekaServer
public class SpringApplicationCore {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationCore.class, args);
    }
}
