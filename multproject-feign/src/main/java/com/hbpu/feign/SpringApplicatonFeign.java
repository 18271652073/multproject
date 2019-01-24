package com.hbpu.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author Administrator
 * @date 2018/9/26.
 */
@SpringBootApplication
@EnableFeignClients                   //开启feign功能
@EnableHystrix
@EnableDiscoveryClient
public class SpringApplicatonFeign {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicatonFeign.class, args);
    }
}
