package com.ProPulse.Backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/test1")
    public String testApi() {
        return "API fonctionne !";
    }
}
