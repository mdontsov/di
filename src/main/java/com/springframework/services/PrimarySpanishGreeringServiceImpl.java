package com.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
* When @Profile is not active, Spring will ignore it
* Active profiles are from application.properties file
* */

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreeringServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
