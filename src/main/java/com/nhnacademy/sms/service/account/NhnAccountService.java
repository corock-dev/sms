package com.nhnacademy.sms.service.account;

import com.nhnacademy.sms.domain.Account;
import com.nhnacademy.sms.repository.account.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NhnAccountService implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> getAccount(Long id) {
        return Optional.of(accountRepository.findById(id).orElseThrow());
    }

    @Transactional
    @Override
    public Account createAccount(Account account) {
        boolean present = accountRepository.findById(account.getId()).isPresent();
        if (present) {
            throw new IllegalStateException("already exists " + account.getId());
        }

        return accountRepository.save(account);
    }

    @Transactional
    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

}
