package com.example.bootfeign.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallbackFactory implements FallbackFactory<UserClientService> {

    @Override
    public UserClientService create(Throwable cause) {
        return new UserClientService() {
            @Override
            public String get() {
                return null;
            }
        };
    }

}
