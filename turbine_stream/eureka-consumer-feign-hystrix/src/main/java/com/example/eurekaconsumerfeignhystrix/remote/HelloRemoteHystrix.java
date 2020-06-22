package com.example.eurekaconsumerfeignhystrix.remote;

import org.springframework.stereotype.Component;

/**
 * @FileName: HelloRemoteHystrix
 * @author: JIAOJIAO
 * @Date: 2020/6/22
 * @version: 1.0.0
 * @remark:
 * @explain:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello world";
    }
}
