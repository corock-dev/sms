package com.nhnacademy.sms.api;

import com.nhnacademy.sms.config.AccountProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SystemController {

    private final AccountProperties accountProperties;

    @GetMapping("/system/author")
    public SystemInfo external() {
        // return ResponseEntity.status(200)
        //                      .headers(httpHeaders -> httpHeaders.setContentType(APPLICATION_JSON))
        //                      .body("{ \"author\": \"" + accountProperties.getAuthor() + "\" }");

        return new SystemInfo(accountProperties.getAuthor());
    }

    @RequiredArgsConstructor
    @Getter
    static class SystemInfo {
        private final String author;
    }

}
