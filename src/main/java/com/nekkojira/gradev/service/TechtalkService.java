package com.nekkojira.gradev.service;

import com.nekkojira.gradev.domain.Techtalk;
import com.nekkojira.gradev.repository.TechtalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class TechtalkService {
    private transient final TechtalkRepository techtalkRepository;

    @Autowired
    public TechtalkService(final TechtalkRepository techtalkRepository) {
        this.techtalkRepository = techtalkRepository;
    }

    public Techtalk createTechtalk(final Techtalk techtalk) {
        final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        final Techtalk createdTalk = new Techtalk(techtalk.getTitle(), techtalk.getSpeaker(), techtalk.getDescription(), timestamp, techtalk.getPresentationTimestamp());

        techtalkRepository.save(createdTalk);
        return createdTalk;
    }
}
