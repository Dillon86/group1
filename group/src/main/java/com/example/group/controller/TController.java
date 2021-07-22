package com.example.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TController {
    private @Autowired
    Environment env;

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        return "legends never die!";
    }
}
