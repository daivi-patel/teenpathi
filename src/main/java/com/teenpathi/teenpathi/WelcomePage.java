package com.teenpathi.teenpathi;

//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomePage {
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
