<<<<<<< HEAD
package com.itheima.eurekaconsumer.controller;

import com.itheima.eurekaconsumer.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;
    @GetMapping("/hello")
    public String hello() {
        return ribbonService.hello();
    }
}
=======
package com.itheima.eurekaconsumer.controller;

import com.itheima.eurekaconsumer.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;
    @GetMapping("/hello")
    public String hello() {
        return ribbonService.hello();
    }
}
>>>>>>> 75ccd4f493b361472d3814f9b552aa92e362a99b
