package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetesDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(KubernetesDemoApp.class, args);
    }

    @GetMapping(path = "/test")
    public String test() {
        return "working!";
    }
}