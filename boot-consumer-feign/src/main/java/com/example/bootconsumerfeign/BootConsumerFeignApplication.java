package com.example.bootconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.example.bootfeign")
@ComponentScan(basePackages = {"com.example"})
public class BootConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootConsumerFeignApplication.class, args);
    }

}

