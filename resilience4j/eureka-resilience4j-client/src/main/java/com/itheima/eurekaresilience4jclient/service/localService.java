package com.itheima.eurekaresilience4jclient.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class localService {
    @Autowired
    private RestTemplate restTemplate;

    @CircuitBreaker(name = "breaker",fallbackMethod = "hi")
    public String hi(String id){
        System.out.println("调用了我");
        return restTemplate.getForObject("http://eureka-provider/hi?id="+id, String.class);
    }

    public String hi(Exception e){
        return String.format("hi 你的信息发生错误");
    }

}
