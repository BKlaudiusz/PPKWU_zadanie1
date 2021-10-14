package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rev_controller {

    @GetMapping("/")
    public String index(@RequestParam String rev) {
        return "Greetings from Spring Boot!";
    }

}