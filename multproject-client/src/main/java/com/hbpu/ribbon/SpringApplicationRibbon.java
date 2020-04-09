package com.hbpu.ribbon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @date 2018/9/21.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient            //通过该注解，实现服务发现，注册
@EnableHystrix
@EnableHystrixDashboard
//@EnableCircuitBreaker
public class SpringApplicationRibbon {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringApplicationRibbon.class).web(true).run(args);
    }
}
