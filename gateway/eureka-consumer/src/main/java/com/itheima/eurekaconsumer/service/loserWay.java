package com.itheima.eurekaconsumer.service;

import com.itheima.eurekaconsumer.controller.FeignController;
import com.itheima.eurekaconsumer.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class loserWay implements FeignService {
    @Override
    public String hi(String id) {
        return String.format("Hi，your message is : %s but request bad.", id);
    }

    @Override
    public String getPort(){
        return "fallback_consumer";
    };

    @Override
    public String sayHello(){
        return "Hello World";
    };
    @Override
    public String hello(@RequestParam String name){
        return String.format("Hello %s!", name);
    };

    @Override
    public User hello(@RequestParam String name, @RequestHeader Integer age){
        return new User(name, age);
    };

    @Override
    public String hello(@RequestBody User user){
        return String.format("Hello %s!", user.getName());
    };

}
