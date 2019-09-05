package com.now.eureka.producer1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {

        return "hello, " + name + ", i am from " + port;
    }
}
