package com.itheima.eurekafeignclient.service;


import com.itheima.eurekafeignclient.pojo.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@FeignClient(name = "provider")
public interface FeignService {
    @GetMapping("/hello")
    public String helloAndNonePara();//没有参数绑定

    @GetMapping("/getName")
    public String sayName(@RequestParam("name") String name);//含有单个参数绑定

    @GetMapping("/getaihao")
    public String getNnameAndHob(@RequestParam("name") String name,@RequestParam("hobby")String hobby);//含有多个参数绑定

    @PostMapping("/getPerson")
    public String sayPerson(@RequestBody Person person);
}
