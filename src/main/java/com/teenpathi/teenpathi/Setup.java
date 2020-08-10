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
import org.springframework.web.servlet.ModelAndView;

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
}
