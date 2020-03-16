package com.example.demo.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Controller
public class LoginController {

    @Autowired
    UserRepository repos;
    
    @GetMapping(path = "loginForm")
    String loginForm() {
        return "loginForm";
    }
}