package com.nhnacademy.sms.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class Student {

    private final String name;
    private final int score;

}
