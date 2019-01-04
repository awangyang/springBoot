package com.example.bootproviderservice.service.impl;

import com.example.bootproviderservice.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: WangYang
 * @date: 2018-12-30 17:18:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String get() {
        return "hellooooooooooooo!";
    }
}
