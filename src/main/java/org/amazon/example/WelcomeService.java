package org.amazon.example;


import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public String getWelcomeMessage() {
        return "Welcome to Amazon Example";
    }
}
