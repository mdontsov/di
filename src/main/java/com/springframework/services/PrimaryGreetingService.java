package com.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary // Explicitly defines the primary bean. Autowired by default if no @Qualifier is specified
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the primary Greeting Service!";
    }
}
