package com.springframework.controllers;

import com.springframework.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
