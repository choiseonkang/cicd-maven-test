package com.example.cicdmaventest;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequiredArgsConstructor
public class TestController {

    private Environment env;

    @GetMapping("/health-check")
    public boolean healthCheck() {
        return true;
    }

    @GetMapping("/")
    public String test() {
        return "test 완료";
    }

    @GetMapping("/profile")
    public String getProfile() {
        return Arrays.stream(env.getActiveProfiles()).findFirst().orElse("");
    }
}
