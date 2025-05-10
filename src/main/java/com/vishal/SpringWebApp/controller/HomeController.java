package com.vishal.SpringWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet() {
        return "Welcome to Home";
    }

    @RequestMapping("/about")
    public String about() {
        return "about page";
    }
}
