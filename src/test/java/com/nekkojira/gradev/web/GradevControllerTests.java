package com.nekkojira.gradev.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(GradevController.class)
public class GradevControllerTests extends Controller {
    @Test
    public void indexShouldReturnView() throws Exception {
        final MockHttpServletRequestBuilder get = MockMvcRequestBuilders.get("");
        final ResultActions request = mockMvc.perform(get).andDo(print);

        request.andExpect(status.isOk());
        request.andExpect(view.name("index"));
    }
}
