package com.itheima.gatewayresilience4j.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/fallback")
    public String fallbackMethod() {
        return "fallback_7310";
    }
}