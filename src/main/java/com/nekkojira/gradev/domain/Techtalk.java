package com.nekkojira.gradev.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Getter
@RequiredArgsConstructor
public class Techtalk {
    @Id
    @GeneratedValue
    @Setter
    private int id;
    private final String title;
    private final String speaker;
    private final String description;
    private final Timestamp createdTimestamp;
    private final Timestamp presentationTimestamp;
}
