package com.example.task_01.Controllers;

import com.example.task_01.Models.Celebration;
import com.example.task_01.Models.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")

public class Controller {

    private Greeting greeting;



    @GetMapping
    public ResponseEntity<Greeting> newGreeting() {
        Greeting greeting = new Greeting("rebecca", "Afternoon");
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }

//    @GetMapping
//    public String timeOfDay(@RequestParam(value = "timeOfDay") String timeOfDay) {
//        return "Good " + timeOfDay;
//    }


//@GetMapping
//    public String greeting(@RequestParam(value = "name") String name) {
//    return "Good afternoon " + name;
//}

//    @GetMapping
//    public ResponseEntity<Greeting> newGreeting() {
//        Greeting greetimg = new Greeting("rebecca", "Afternoon");
//        return new ResponseEntity<>(greeting, HttpStatus.OK);
//    }

    @GetMapping("/christmas")
    public ResponseEntity<Celebration> newCelebration() {
        Celebration celebration = new Celebration("Ba Humbug!");
        return new ResponseEntity<>(celebration, HttpStatus.OK);
    }

}
