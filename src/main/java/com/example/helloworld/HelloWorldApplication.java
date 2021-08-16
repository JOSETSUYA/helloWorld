package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(HelloWorldApplication.class, args);
        System.out.println("Hello world");

        String tomate;

        tomate = "chorizo en la paela pela ole ole";

        System.out.println(tomate);
        System.out.println("Esto no va");
    }

}
