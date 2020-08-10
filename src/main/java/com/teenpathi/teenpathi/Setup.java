package com.teenpathi.teenpathi;

import com.teenpathi.teenpathi.objects.Card;
import com.teenpathi.teenpathi.objects.Deck;
import com.teenpathi.teenpathi.objects.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    @PostMapping("/startgame")
    public String startgame(Model model, HttpServletRequest request) {
        String variable1 = "Hello";
        model.addAttribute("variable1", variable1);
        request.setAttribute("variable2", "Value of variable2!");
        return "start game";
    }
}
