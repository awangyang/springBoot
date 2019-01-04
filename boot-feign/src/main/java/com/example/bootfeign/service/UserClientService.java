package com.example.bootfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider-service", fallbackFactory = UserClientFallbackFactory.class)
public interface UserClientService {

    @GetMapping(value = "/get")
    String get();

}
