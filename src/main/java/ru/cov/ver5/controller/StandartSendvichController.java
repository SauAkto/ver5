package ru.cov.ver5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StandartSendvichController {

    @GetMapping("/standartsendvich")
    public String standSendvich(Model model) {
        model.addAttribute("title", "Standart sendvich");
        return "standartsendvich";
    }
}
