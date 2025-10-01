package com.example.ToyShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    //Main Page
    @GetMapping({"","/"})
    public String index(){
        return "main/index";
    }
}
