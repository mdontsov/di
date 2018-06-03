package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

    public String sayGreeting() {
        return "Hello - i'm injected with Setter!";
    }
}
