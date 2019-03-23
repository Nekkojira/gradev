package com.nekkojira.gradev.web.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest
public class GradevControllerTest extends Controller {

    @Test
    public void shouldReturnContent() throws Exception {
        MockHttpServletRequestBuilder get = MockMvcRequestBuilders.get("");
        ResultActions request = mockMvc.perform(get).andDo(print);

        request.andExpect(status.isOk());
        request.andExpect(view.name("index"));
    }
}
