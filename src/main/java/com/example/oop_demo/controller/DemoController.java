package com.example.oop_demo.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String getDemo() {
        return "GET request received!";
    }

    @PostMapping
    public String postDemo(@RequestBody String body) {
        return "POST request received with body: " + body;
    }
}
