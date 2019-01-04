package com.example.bootproviderservice.controller;

import com.example.bootproviderservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: WangYang
 * @date: 2018-12-30 17:19:53
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("get")
    public String get() {
        return userService.get();
    }
}
