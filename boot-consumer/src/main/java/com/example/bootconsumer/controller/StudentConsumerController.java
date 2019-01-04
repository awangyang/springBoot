package com.example.bootconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 服务消费者-学生信息控制器
 *
 * @author Administrator
 */
@RestController
public class StudentConsumerController {

    @Resource
    private RestTemplate restTemplate;

//    private final static String PRE_HOST = "http://MICROSERVICE-STUDENT";
    private final static String PRE_HOST = "http://provider-service:8001";

    /**
     * @return
     */
    @GetMapping(value = "/get")
    public String save() {
        return restTemplate.getForObject(PRE_HOST + "/get", String.class);
    }

}
