package com.reancode.profilemanagementservice.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class DemoService {

    public String sayHello() {
        return "Hello World!";
    }
}
