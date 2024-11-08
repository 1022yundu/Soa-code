package com.itheima.eurekaresiliencefeignclient.controller;

import com.itheima.eurekaresiliencefeignclient.seivice.feignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class feignController {
    @Autowired
    private feignService feignService;

    @GetMapping("/hi")
    public String hi(String id) {
        return feignService.sayHi(id);
    }
}
