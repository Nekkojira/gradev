package com.nekkojira.gradev.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nekkojira.gradev.domain.Techtalk;
import com.nekkojira.gradev.service.TechtalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private transient final TechtalkService techtalkService;
    private transient final ObjectMapper objectMapper;

    @Autowired
    public ApiController(final TechtalkService techtalkService, final ObjectMapper objectMapper) {
        this.techtalkService = techtalkService;
        this.objectMapper = objectMapper;
    }

    @PostMapping(value = "/api/create", produces = "application/json")
    public String createTechTalk(final @RequestBody Techtalk techtalk) throws JsonProcessingException {
        final Techtalk createdTalk = techtalkService.createTechtalk(techtalk);
        return objectMapper.writeValueAsString(createdTalk);
    }
}
