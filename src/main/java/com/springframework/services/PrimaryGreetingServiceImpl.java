package com.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
* Explicitly defines the primary bean
* Autowired by default if no @Qualifier is specified
* If there are 2 @Primary beans having @Profile set, then active @Profile must be set from application.properties
* */

@Service
@Profile("en")
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the primary Greeting Service!";
    }
}
