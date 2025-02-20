package org.example.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name
    @Value("{coach.name}")
    private String coachName;
    @Value("{team.name}")
    private String teamName;

    // expose new endpoint for "team-info"
    @GetMapping("team-info")
    public String teamInfo() {
        return "Coach: " + coachName + " , Team name: " + teamName;
    }

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
