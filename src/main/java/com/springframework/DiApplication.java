package com.springframework;

import com.springframework.controllers.CustomController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiApplication.class, args);

        CustomController controller = (CustomController) context.getBean("customController"); //Bean instantiation
        controller.hello();
    }
}
