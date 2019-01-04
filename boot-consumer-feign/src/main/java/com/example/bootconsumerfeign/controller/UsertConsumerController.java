package com.example.bootconsumerfeign.controller;

import com.example.bootfeign.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费者-学生信息控制器
 *
 * @author Administrator
 */
@RestController
public class UsertConsumerController {

    @Autowired
    private UserClientService userClientService;

    @GetMapping(value = "/get")
    public String get() {
        return userClientService.get();
    }

}
