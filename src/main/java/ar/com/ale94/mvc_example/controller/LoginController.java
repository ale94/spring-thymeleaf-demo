package ar.com.ale94.mvc_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String user, @RequestParam String password, Model model) {
        if (!user.isBlank() || !password.isBlank()) {
            model.addAttribute("user", user);
        }
        return "dashboard";
    }
}
