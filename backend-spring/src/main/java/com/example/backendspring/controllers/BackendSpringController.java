package com.example.backendspring.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
public class BackendSpringController {

    @GetMapping("/welcome")
    public String index(){
        return "welcome";
    }



}
