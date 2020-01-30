package com.kanahei.controller;

import com.kanahei.model.ImageModel;
import com.kanahei.response.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/image")
public class ImageController {

    @PostMapping("/add")
    @ResponseBody
    public ApiResponse add(@RequestParam("imageModel") ImageModel imageModel){
        return new ApiResponse(true, "", null);
    }

    @PostMapping("/modify/{imageNo}")
    @ResponseBody
    public ApiResponse modify(@PathVariable("imageNo") int imageNo,
                              @RequestParam("imageModel")ImageModel imageModel){
        return new ApiResponse(true, "", null);
    }

    @GetMapping("/list/{page}")
    @ResponseBody
    public ApiResponse list(@PathVariable("page") int page){
        return new ApiResponse(true, "", null);
    }
}
