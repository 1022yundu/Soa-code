package com.itheima.eurekaresilience4jclient.controller;

import com.itheima.eurekaresilience4jclient.service.localService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class resController {
    @Autowired
    localService service;

    @GetMapping("/hi")
    public String hi(String id)throws Exception {
        return service.hi(id);
    }
}
