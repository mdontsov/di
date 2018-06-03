package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public String sayGreeting() {
        return "Hello - i'm injected with constructor!";
    }
}
