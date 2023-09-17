package com.maxime.simpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApp {

    /**
     * You can run multiple instances of this Application API on different ports by configuring the
     * application.properties file or using command-line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(SimpleApp.class, args);
    }
}



