package com.example.bootzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class BootZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootZuulApplication.class, args);
    }

}

