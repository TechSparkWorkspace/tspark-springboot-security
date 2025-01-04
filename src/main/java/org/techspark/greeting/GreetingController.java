package org.techspark.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // Public endpoint, accessible by anyone
    @GetMapping("/public")
    public String publicGreeting() {
        return "Hey anonymous welcome to TechSpark!";
    }

    // Protected endpoint, requires authentication
    @GetMapping("/protected")
    public String protectedGreeting() {
        return "Hey Premium User welcome back!";
    }
}
