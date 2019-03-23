package com.nekkojira.gradev.service;

import com.nekkojira.gradev.domain.Techtalk;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TechtalkServiceTests {
    @Autowired
    private transient TechtalkService techtalkService;

    @Test
    public void createTalk() {
        final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        final Techtalk techtalk = new Techtalk("Title", "User", "Description", timestamp, timestamp);
        final Techtalk expected = techtalkService.createTechtalk(techtalk);

        Assertions.assertThat(expected.getId()).isGreaterThan(techtalk.getId());
        Assertions.assertThat(expected.getTitle()).isEqualTo(techtalk.getTitle());
        Assertions.assertThat(expected.getDescription()).isEqualTo(techtalk.getDescription());
        Assertions.assertThat(expected.getSpeaker()).isEqualTo(techtalk.getSpeaker());
        Assertions.assertThat(expected.getCreatedTimestamp()).isNotSameAs(techtalk.getCreatedTimestamp());
        Assertions.assertThat(expected.getPresentationTimestamp()).isEqualTo(techtalk.getPresentationTimestamp());
    }
}
