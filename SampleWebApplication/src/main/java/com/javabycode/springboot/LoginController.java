package com.javabycode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(Model model, @RequestParam(value="name", required=false, defaultValue="anonymous") String name) {
        
        String message="You just create Spring Boot Example successfully";
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        
        return "home";
    }
}
