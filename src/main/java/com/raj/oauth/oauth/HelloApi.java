package com.raj.oauth.oauth;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class HelloApi {

    @GetMapping("/api/hello")
    public String sayHello(){
        return "Hello";
    }
}
