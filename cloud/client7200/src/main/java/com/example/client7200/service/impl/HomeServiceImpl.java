package com.example.client7200.service.impl;

import com.example.client7200.service.HomeService;
import org.springframework.stereotype.Component;

@Component
public class HomeServiceImpl implements HomeService {

    @Override
    public String home(String name) {
        return "error!";
    }
}
