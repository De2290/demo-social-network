package com.de2290.imageBoard;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Router {


    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String serveLogin() {
        return "login";
    }

    @GetMapping("/register")
    public String serveRegister() {
        return "register";
    }

    @GetMapping("/profile")
    public String serveProfile() {
        return "profile";
    }

    @GetMapping("/newPost")
    public String servePostCreator() {
        return "newpost";
    }
}
