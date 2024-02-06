package com.example.hw7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    /**
     * Домашняя страница.
     */
    @GetMapping("/")
    public String home(){
        return "home";
    }

    /**
     * Страница для пользователей(user, admin).
     */
    @GetMapping("/public-data")
    public String user(){
        return "public";
    }

    /**
     * Страница для пользователей(admin).
     */
    @GetMapping("/private-data")
    public String admin(){
        return "private";
    }

    /**
     * Аутентификация пользователя.
     */
    @GetMapping("/login")
    public String auth(){
        return "login";
    }
}