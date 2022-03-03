package com.jc.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/nested")
public class Nested {
    @GetMapping("/1")
    int one(){
        return 1;
    }

    @GetMapping("/2")
    String two(){
        return "<h1>Hello</h1><p>I am HTML in STRING</p>";
    }
}
