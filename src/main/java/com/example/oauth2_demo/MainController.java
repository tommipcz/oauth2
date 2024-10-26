package com.example.oauth2_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "Hello !!!";
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

}
