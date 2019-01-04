package com.example.bootturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class BootTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootTurbineApplication.class, args);
    }

}

