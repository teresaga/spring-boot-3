package org.example.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String workout() {
        return "Run day";
    }

    @GetMapping("/fortune")
    public String fortune() {
        return "Have a lucky day";
    }
}
