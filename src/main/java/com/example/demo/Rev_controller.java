package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rev_controller {

    @GetMapping("/api/rev")
    public String index(@RequestParam("rev") String rev) {
        return (new StringBuilder(rev).reverse().toString());
    }

}