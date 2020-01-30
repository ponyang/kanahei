package com.kanahei.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class WebController {

    @Value("${test.name}")
    private String test;

    @GetMapping("/index")
    public String index(){
        log.error(test);
        log.error("------ web controller----");
        return "index.html";
    }
}
