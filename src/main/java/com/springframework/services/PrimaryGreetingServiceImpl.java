package com.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
* Explicitly defines the primary bean.
* Autowired by default if no @Qualifier is specified
* */

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the primary Greeting Service!";
    }
}
