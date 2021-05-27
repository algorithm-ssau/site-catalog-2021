package com.su.pets.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class TestController {

    @GetMapping("/")
    public String get(Model model) {
        return "index";
    }

}
