package com.nekkojira.gradev.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.result.*;

public class Controller {
    @Autowired
    protected transient MockMvc mockMvc;

    @Autowired
    protected transient ObjectMapper objectMapper;

    protected final ResultHandler print = MockMvcResultHandlers.print();
    protected final StatusResultMatchers status = MockMvcResultMatchers.status();
    protected final ViewResultMatchers view = MockMvcResultMatchers.view();
    protected final ModelResultMatchers model = MockMvcResultMatchers.model();
    protected final ContentResultMatchers content = MockMvcResultMatchers.content();
}
