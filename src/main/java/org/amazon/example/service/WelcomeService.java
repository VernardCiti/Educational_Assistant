package org.amazon.example.service;


import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public String getWelcomeMessage() {
        return "Welcome to Amazon Example";
    }
}
