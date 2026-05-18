package com.jai.awsdemo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Welcome Jai! AWS Deployment working";
    }
    @GetMapping("/version")
    public String version() {
        return "Jai Welcome to Version 2";
    }
    @GetMapping("/health")
    public String health() {
        {
            return "Application is up and running";
        }
    }
}
