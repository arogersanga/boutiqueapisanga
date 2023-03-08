package fr.arsangamarche.boutiqueapisanga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")
public class IndexController {

    @GetMapping({ "/index" })
    public String index(Model model) {
        model.addAttribute("name", "Madame - Monsieur"); // set 'Monsieur Madame' value for 'name' attribute

        return "index"; // name of the View
    }
    @GetMapping({ "/error" })
    public String error() {
        return "error"; // name of the View
    }
}