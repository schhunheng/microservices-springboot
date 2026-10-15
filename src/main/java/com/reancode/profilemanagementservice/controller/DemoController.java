package com.reancode.profilemanagementservice.controller;

import com.reancode.profilemanagementservice.service.DemoService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DemoController {
    private final DemoService service;

    @GetMapping("/hello")
    public String hello() {
        return service.sayHello();
    }
}
