package com.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
* Default profile is applied only when Active profile is not specified
* Otherwise Active profile overrides Default
* */

@Service
@Profile({"de", "default"})
@Primary
public class PrimaryGermanGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Begrüßung des primären Dienstes";
    }
}
