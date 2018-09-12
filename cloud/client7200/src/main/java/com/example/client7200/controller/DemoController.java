package com.example.client7200.controller;

import com.example.client7200.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    HomeService homeService;

    @GetMapping("/home")
    String home(@RequestParam String name){
        return homeService.home(name);
    }

}
