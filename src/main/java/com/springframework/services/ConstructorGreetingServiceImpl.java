package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    public String sayGreeting() {
        return "Hello - i'm injected with constructor!";
    }
}
