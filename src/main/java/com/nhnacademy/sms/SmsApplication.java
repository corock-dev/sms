package com.nhnacademy.sms;

import com.nhnacademy.sms.config.StudentProperties;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
// TODO #2: 이렇게 되면 StudentProperties 가 빈이 됨
@EnableConfigurationProperties(StudentProperties.class)
// TODO #5: properties 에 자동완성 되게 하기 위해 (여기가 국룰)
@ConfigurationPropertiesScan
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
