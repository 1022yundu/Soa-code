package com.itheima.eurekaprovider.controller;

import com.itheima.eurekaprovider.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String hi(String id) {
        return "Hi, 访问成功!" + id;
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/port")
    public String getPort() {
        return "Hello World, I'm from port:" + port;
    }


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "你好，我是服务提供者"+port;
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestParam String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + "," + user.getAge();
    }
}
