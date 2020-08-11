package com.teenpathi.teenpathi;

import com.teenpathi.teenpathi.objects.Deck;
import com.teenpathi.teenpathi.objects.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class Setup {

    Deck deck = new Deck();

    @GetMapping("/setup")
    public String setupForm(Model model) {
        model.addAttribute("people", new People());
        return "setup";
    }

    @PostMapping("/setup")
    public String setupSubmit(@ModelAttribute People people, Model model) {
        model.addAttribute("people", people);
        return "startgame";
    }

    @GetMapping("/startgame")
    public String startgame(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "startgame";
    }
}
