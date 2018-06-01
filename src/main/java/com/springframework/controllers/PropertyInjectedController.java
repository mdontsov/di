package com.springframework.controllers;

import com.springframework.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
