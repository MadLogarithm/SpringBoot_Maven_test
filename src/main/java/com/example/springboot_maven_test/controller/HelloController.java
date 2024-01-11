package com.example.springboot_maven_test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
