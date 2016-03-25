package com.mishadoff.bugs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mishadoff.bugs")
public class Runner {
    public static void main(String[] args) {
        new SpringApplication(Runner.class).run(args);
    }
}
