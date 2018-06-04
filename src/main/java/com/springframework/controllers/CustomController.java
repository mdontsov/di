package com.springframework.controllers;

import com.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CustomController {

    private GreetingService greetingService;

//    @Autowired
    public CustomController(/* @Qualifier("primaryGreetingService") */ GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello from Custom Controller!");

        return greetingService.sayGreeting();
    }
}
