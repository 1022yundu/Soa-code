package com.itheima.eurekaprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class eurekaController {
    @GetMapping("/hi")
    public String hi(String id) {
        return "你输入的消息是"+id;
    }
}
