package com.jc.HelloWorld;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class HelloWorldApplication {
	String currName = "World";

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return String.format("Hello, %s", currName);
	}

	@PostMapping("/name")
	public String name(@RequestBody Name name) {
		currName = name.getName();
		return name.getName();
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s", name);
	}
}
