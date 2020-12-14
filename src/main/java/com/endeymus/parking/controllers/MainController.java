package com.endeymus.parking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class MainController {

    @GetMapping
    public String main() {
        return "operator/main";
    }

    @ModelAttribute("title")
    public String title() {
        return "Страница информации";
    }
}
