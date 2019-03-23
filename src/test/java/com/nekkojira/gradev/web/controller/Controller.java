package com.nekkojira.gradev.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.ModelResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;
import org.springframework.test.web.servlet.result.ViewResultMatchers;

public class Controller {
    @Autowired
    protected MockMvc mockMvc;
    protected ResultHandler print = MockMvcResultHandlers.print();
    protected StatusResultMatchers status = MockMvcResultMatchers.status();
    protected ViewResultMatchers view = MockMvcResultMatchers.view();
    protected ModelResultMatchers model = MockMvcResultMatchers.model();
}
