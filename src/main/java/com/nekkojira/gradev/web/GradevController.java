package com.nekkojira.gradev.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradevController {
    @GetMapping("")
    public String index() {
        return "index";
    }
}
