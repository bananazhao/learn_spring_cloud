package com.example.eurekaconsumerfeignhystrix.controller;

import com.example.eurekaconsumerfeignhystrix.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private HelloRemote helloRemote;
    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloRemote.hello(name + "!");
    }

}
