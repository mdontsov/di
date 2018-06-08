package com.springframework.controllers;

import com.springframework.services.PropertyGreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new PropertyGreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(PropertyGreetingServiceImpl.HELLO, setterInjectedController.sayHello());
    }
}
