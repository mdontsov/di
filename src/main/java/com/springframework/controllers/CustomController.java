package com.springframework.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class CustomController {

    public String hello() {
        System.out.println("Hello!!!");
        return "OK";
    }
}
