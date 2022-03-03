package com.jc.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class NameParams {
    @GetMapping("/{user}")
    String getUser(@PathVariable String user) {
        return String.format("<h1>Welcome!</h1><p>Hi, %s, how are you?", user);
    }

    @GetMapping("/{user}/awesome")
    String getUserAwesome(@PathVariable String user) {
        return String.format("<h1>Hi, %1$s</h1><p>Everyone, %1$s is awesome!", user);
    }
}
