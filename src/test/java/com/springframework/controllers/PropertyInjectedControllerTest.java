package com.springframework.controllers;

import com.springframework.services.PropertyGreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new PropertyGreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(PropertyGreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
