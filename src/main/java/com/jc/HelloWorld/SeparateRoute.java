package com.jc.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeparateRoute {
    @GetMapping("/route")
    String route(){
        return "I'm in a special place in code!";
    }
}
