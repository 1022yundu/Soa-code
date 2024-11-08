package com.itheima.eurekafeignclient.controller;

import com.itheima.eurekafeignclient.pojo.Person;
import com.itheima.eurekafeignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("访问了feign-client");
        return feignService.helloAndNonePara();
    }

    @GetMapping("/getName")
    public String name() {
        return feignService.sayName("陈桥东");
    }

    @GetMapping("/getaihao")
    public String nnameAndHob() {
        return feignService.getNnameAndHob("陈桥东","女");
    }

    @GetMapping("/getPerson")
    public String person() {
        return feignService.sayPerson(new Person("陈桥东",20,"男","女"));
    }
}
