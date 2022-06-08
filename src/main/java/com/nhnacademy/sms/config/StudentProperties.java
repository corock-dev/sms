package com.nhnacademy.sms.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

// TODO #1
@Getter
@Setter
@ConfigurationProperties(prefix = "student")
public class StudentProperties {

    private Integer age;
    private String myName;

}
