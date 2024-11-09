package com.itheima.eurekaconsumer.controller;

import com.itheima.eurekaconsumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @Value("${server.port}")
    String port;


    @GetMapping("/hello")
    public String hello(){
        return feignService.getPort()+";我自己是"+port;
    }

//    @GetMapping("/hello")
//    public String hello2(){
//        return "你好，我是服务消费者！！";
//    }
}
