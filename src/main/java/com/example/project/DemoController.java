package com.example.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public String getHelloWorld() {
        return "Hello World!";
    }
}
