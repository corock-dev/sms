package com.nhnacademy.sms.service;

import com.nhnacademy.sms.domain.Account;
import com.nhnacademy.sms.service.account.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class NhnAccountServiceTest {

    @Autowired
    AccountService accountService;

    // @Test
    void getAccounts() {
        List<Account> accounts = accountService.getAccounts();

        assertThat(accounts).hasSize(2);
    }

}
