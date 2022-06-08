package com.nhnacademy.sms.api.account;

import com.nhnacademy.sms.domain.Account;
import com.nhnacademy.sms.service.account.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static java.lang.System.lineSeparator;

@RequiredArgsConstructor
@RestController
@RequestMapping("/accounts/{id}")
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id).orElseThrow();
    }

    @DeleteMapping
    public String deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return "{ \"result\": \"OK\" }" + lineSeparator();
    }

}
