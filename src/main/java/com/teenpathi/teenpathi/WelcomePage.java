package com.teenpathi.teenpathi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WelcomePage {

//    @RequestMapping("/")
//    public String welcome() {
//        return "welcome";
//    }
    @GetMapping("/")
    public String welcome(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        return "welcome";
    }
}
