package ru.cov.ver5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PricePigmentController {

    @GetMapping("/pricepigment")
    public String pricepigment(Model model) {
        model.addAttribute("title", "Price pigments");
        return "pricepigment";
    }
}
