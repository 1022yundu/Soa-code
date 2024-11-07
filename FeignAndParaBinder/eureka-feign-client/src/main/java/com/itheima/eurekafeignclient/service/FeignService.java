package com.itheima.eurekafeignclient.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "provider")
public interface FeignService {
    @GetMapping("/hello")
    public String helloAndNonePara();//没有参数绑定

    @GetMapping("/name")
    public void helloAnoPara(String name);//含有参数绑定
}
