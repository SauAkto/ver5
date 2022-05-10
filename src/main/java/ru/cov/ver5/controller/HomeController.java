package ru.cov.ver5.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("title", "Start page");
        return "home";
    }

    @GetMapping("/home")
    public String homePage2(Model model) {
        model.addAttribute("title", "Start page");
        return "home";
    }

}