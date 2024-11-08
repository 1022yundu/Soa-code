package com.itheima.feignprovider.controller;

import com.itheima.feignprovider.pojo.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeignController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String helloAndNonePara() {
        System.out.println("你好，我来自端口:"+port);
        return "大家好，我是李涛，来自"+port+"喜欢唱跳，rap和篮球";
    }

    @GetMapping("/getName")
    public String sayName(String name) {
        return "我的名字是"+name;
    }

    @GetMapping("/getaihao")
    public String sayNameAndHob( String name,String hobby) {
        return "我的名字是"+name+",爱好"+hobby;
    }

    @PostMapping("/getPerson")
    public String sayPerson(@RequestBody Person person) {
        return person.toString();
    }
}
