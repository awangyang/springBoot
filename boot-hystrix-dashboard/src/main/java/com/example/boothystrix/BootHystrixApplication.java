package com.example.boothystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient // 配置本应用将使用服务注册和服务发现
@EnableCircuitBreaker
@EnableHystrixDashboard
public class BootHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootHystrixApplication.class, args);
    }

}

