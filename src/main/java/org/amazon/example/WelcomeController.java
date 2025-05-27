package org.amazon.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private final WelcomeService welcomeService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("api/example")
    public String example() {
        return welcomeService.getWelcomeMessage();
    }
}
