package com.teenpathi.teenpathi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomePage {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
}
