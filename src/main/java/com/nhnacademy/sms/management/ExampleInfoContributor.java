package com.nhnacademy.sms.management;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ExampleInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        // builder.withDetails(Map.of("name", "corock"));
        builder.withDetail("example", Map.of("name", "corock"));
    }

}
