package com.nhnacademy.sms.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

// TODO #1
@Getter
@ConfigurationProperties(prefix = "student")
public class StudentProperties {

    private Integer age;

    private String myName;

    public void setMyName(String myName) {
        this.myName = myName;
    }

}
