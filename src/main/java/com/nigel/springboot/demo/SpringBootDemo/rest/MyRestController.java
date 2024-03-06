package com.nigel.springboot.demo.SpringBootDemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // expose "/" that returns "Hello World!"
    @GetMapping("/")
    public String getHello() {
        return "Hello World!";
    }

    // expose endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a 5k!";
    }

    // expose endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }

    // expose endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }
}
