package com.nhnacademy.sms;

import com.nhnacademy.sms.domain.Student;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SmsApplication {

    public static void main(String[] args) {
        // SpringApplication.run(SmsApplication.class, args);

        SpringApplication springApplication = new SpringApplication(SmsApplication.class);
        springApplication.run(args);
        springApplication.setBannerMode(Banner.Mode.OFF);

        // new SpringApplicationBuilder().sources(Student.class).web(WebApplicationType.NONE)
        //         .child(FirstChildConfig.class).web(WebApplicationType.SERVLET)
        //         .sibling()
    }

}
