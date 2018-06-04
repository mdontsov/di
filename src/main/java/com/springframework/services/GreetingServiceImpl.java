package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello from original Service Implementation!";

    public String sayGreeting() {
        return HELLO;
    }
}
