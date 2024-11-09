package com.itheima.eurekaconsumer.service;

import com.itheima.eurekaconsumer.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@FeignClient(name = "eureka-provider" ,fallback = loserWay.class)
public interface FeignService {

    @RequestMapping("/hi")
    public String hi(String id);

    @RequestMapping("/port")
    public String getPort();


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name);


    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestParam String name, @RequestHeader Integer age);


    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user);

}
