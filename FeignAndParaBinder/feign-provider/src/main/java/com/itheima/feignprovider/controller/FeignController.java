package com.itheima.feignprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("你好，我来自端口:"+port);
        return "Hello World";
    }

    @GetMapping("/name")
    public void sayName(String name) {
        System.out.println("我的名字是："+name);
    }
}
