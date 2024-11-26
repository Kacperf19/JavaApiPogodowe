package com.example.weather_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
