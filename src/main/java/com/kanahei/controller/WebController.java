package com.kanahei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @GetMapping("/home")
    @ResponseBody
    public String Index (){
        return "home";
    }

    @GetMapping("/list")
    @ResponseBody
    public String list(){
        return "list";
    }
}
