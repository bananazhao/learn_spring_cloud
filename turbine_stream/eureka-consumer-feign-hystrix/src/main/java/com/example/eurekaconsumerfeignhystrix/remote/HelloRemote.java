package com.example.eurekaconsumerfeignhystrix.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FileName: HelloRemote
 * @author: JIAOJIAO
 * @Date: 2020/6/22
 * @version: 1.0.0
 * @remark:
 * @explain:
 */
@FeignClient(name = "eureka-producer")
public interface HelloRemote {
    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name")String name);
}
