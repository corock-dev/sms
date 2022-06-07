package com.nhnacademy.sms.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private Long id;

    private String name;

    private int score;

}
