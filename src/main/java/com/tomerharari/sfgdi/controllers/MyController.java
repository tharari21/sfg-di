package com.tomerharari.sfgdi.controllers;

import com.tomerharari.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    // best practice for injected components -- make them private final
    private final GreetingService greetingService;

    // recall AutoWired annotation is optional but we can put it if we want
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
