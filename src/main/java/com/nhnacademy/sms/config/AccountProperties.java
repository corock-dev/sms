package com.nhnacademy.sms.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@Getter
@Setter
@ConfigurationProperties(prefix = "com.nhn.account")
public class AccountProperties {

    // javax.validation.
    // @NotNull
    private String author;

}
