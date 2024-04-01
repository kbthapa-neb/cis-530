package com.bookclub.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")

public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showHome() {
        return "home";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String showAboutUs() {
        return "about";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String showContactUs() {
        return "contact";
    }
}