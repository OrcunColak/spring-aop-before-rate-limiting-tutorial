package com.colak.springtutorial.controller;

import com.colak.springtutorial.ratelimiting.RateLimited;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // http://localhost:8080/resource
    @RateLimited
    @GetMapping("/resource")
    public String getResource() {
        return "Resource accessed";
    }
}
