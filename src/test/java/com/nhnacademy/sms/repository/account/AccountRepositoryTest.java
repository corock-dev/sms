package com.nhnacademy.sms.repository.account;

import com.nhnacademy.sms.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

// TODO #4: 리포지터리 테스트 코드 작성
@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void testAccountRepository() {
        Account account = new Account(1L, "111-222-333333", 10_000);
        Account savedAccount = accountRepository.save(account);

        Optional<Account> foundAccount = accountRepository.findById(1L);

        // Assertions
        assertThat(foundAccount).isPresent();
        assertThat(foundAccount.orElse(null)).isEqualTo(account);
        assertThat(foundAccount.orElse(null)).isEqualTo(savedAccount);
    }

}
