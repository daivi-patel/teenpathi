package com.teenpathi.teenpathi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StartGame {

    @RequestMapping("/startgame")
    public String startgame(Model model, HttpServletRequest request) {
        model.addAttribute("variable1", "Value of variable1!");
        request.setAttribute("variable2", "Value of variable2!");
        return "start game";
    }
}
