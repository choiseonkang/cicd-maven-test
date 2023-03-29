package com.example.cicdmaventest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/health-check")
    public boolean healthCheck() {
        return true;
    }

    @GetMapping("/")
    public String test() {
        return "test 완료";
    }
}
