<<<<<<< HEAD
package com.itheima.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloContrller {
    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String hello() {
        return "你好,我来自"+port;
    }
}
=======
package com.itheima.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloContrller {
    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String hello() {
        return "你好,我来自"+port;
    }
}
>>>>>>> 75ccd4f493b361472d3814f9b552aa92e362a99b
