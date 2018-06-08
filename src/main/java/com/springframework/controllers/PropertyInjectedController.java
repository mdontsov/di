package com.springframework.controllers;

import com.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    /*
    * When Qualifier below IS NOT specified then invokes the bean marked as @Primary
    * */

    @Autowired
    @Qualifier("propertyGreetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
