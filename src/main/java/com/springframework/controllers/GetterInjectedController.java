package com.springframework.controllers;

import com.springframework.services.GreetingService;

public class GetterInjectedController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
