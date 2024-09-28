package com.example.demo_deploy_3.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class GreetingController {

    @Value("${devName}")
    private String devName;

    @Value("${authCode}")
    private String authCode;

    @GetMapping("/greet")
    public String greet() {
        return "Hello, my name is " + devName + " and my auth code is " + authCode + ".";
    }
}