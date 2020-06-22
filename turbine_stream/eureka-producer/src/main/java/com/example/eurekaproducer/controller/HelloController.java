package com.example.eurekaproducer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @FileName: HelloController
 * @author: JIAOJIAO
 * @Date: 2020/6/22
 * @version: 1.0.0
 * @remark:
 * @explain:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${config.producer.instance:0}")
    private int instance;
    @GetMapping("/")
    public String hello(@RequestParam String name) {
        return "[" + instance + "]" + "Hello, " + name + " " + new Date();
    }

}
