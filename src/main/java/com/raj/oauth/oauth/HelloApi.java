package com.raj.oauth.oauth;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class HelloApi {

    @GetMapping("hello")
    public String sayHello(){
        return "Hello";
    }
}
