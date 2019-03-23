package com.nekkojira.gradev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GradevController {
    @RequestMapping("")
    public String index() {
        return "index";
    }
}
