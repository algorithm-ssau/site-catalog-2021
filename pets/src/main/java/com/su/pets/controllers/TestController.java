package com.su.pets.controllers;

import com.su.pets.dao.DogsRepository;
import com.su.pets.entity.Dog;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Controller
public class TestController {

    private DogsRepository dogsRepository;

    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("smallDogs", dogsRepository.findBySize("small"));
        model.addAttribute("middleDogs", dogsRepository.findBySize("middle"));
        model.addAttribute("largeDogs", dogsRepository.findBySize("large"));
        return "index";
    }
}
