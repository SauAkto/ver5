package ru.cov.ver5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PriceEPDMController {

    @GetMapping("/priceepdm")
    public String priceepdm(Model model) {
        model.addAttribute("title", "Price EPDM");
        return "priceepdm";
    }
}
