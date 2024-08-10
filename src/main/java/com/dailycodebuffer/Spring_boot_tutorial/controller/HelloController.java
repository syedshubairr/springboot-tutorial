package com.dailycodebuffer.Spring_boot_tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${hello.message}")
    private String msg;

    @GetMapping("/")
    public String hello() {
        return msg;
    }
}
