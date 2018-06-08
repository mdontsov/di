package com.springframework.controllers;

import com.springframework.services.PropertyGreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        constructorInjectedController = new ConstructorInjectedController(new PropertyGreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(PropertyGreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
    }
}
