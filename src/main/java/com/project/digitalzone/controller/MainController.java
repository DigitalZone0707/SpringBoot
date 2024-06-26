package com.project.digitalzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/")
    public String home(Model model) {
        String serverURL = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        model.addAttribute("serverURL", serverURL);
        return "home";
    }

}
