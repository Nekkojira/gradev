package com.nekkojira.gradev.web;

import com.nekkojira.gradev.domain.Techtalk;
import com.nekkojira.gradev.service.TechtalkService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@WebMvcTest(ApiController.class)
public class ApiControllerTests extends Controller {
    @MockBean
    private TechtalkService techtalkService;

    @Test
    public void createTechTalkTest() throws Exception {
        final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        final Techtalk techtalk = new Techtalk("Title", "Speaker", "Description", timestamp, timestamp);
        final Techtalk expected = new Techtalk("Title", "Speaker", "Description", timestamp, timestamp);
        expected.setId(1);

        Mockito.when(techtalkService.createTechtalk(Mockito.any(Techtalk.class))).thenReturn(expected);

        final MockHttpServletRequestBuilder post = MockMvcRequestBuilders
                .post("/api/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(techtalk));
        final ResultActions request = mockMvc.perform(post).andDo(print);

        request.andExpect(status.isOk());
        request.andExpect(MockMvcResultMatchers.jsonPath("$.id", Matchers.is(1)));
    }
}
