package ru.cov.ver5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StandartCovController {


    @GetMapping("/standartcov")
    public String greeting(Model model) {
        model.addAttribute("title", "Standart");
        return "standartcov";
    }

}

