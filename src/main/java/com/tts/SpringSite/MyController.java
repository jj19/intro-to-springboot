package com.tts.SpringSite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/recipe")
    public String recipePage(){
        return "recipe";
    }

    @GetMapping("/rotd")
    public String rotdPage(){
        return "rotd";
    }

    @GetMapping("/")
    public String homePage(){
        return "index";
    }


    }





