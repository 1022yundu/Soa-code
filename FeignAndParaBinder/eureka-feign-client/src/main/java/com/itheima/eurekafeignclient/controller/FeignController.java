package com.itheima.eurekafeignclient.controller;

import com.itheima.eurekafeignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
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
}
