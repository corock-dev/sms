package com.nhnacademy.sms.service.account;

import com.nhnacademy.sms.domain.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<Account> getAccounts();

    Optional<Account> getAccount(Long id);

    Account createAccount(Account account);

    // Account updateAccount(Long id);

    void deleteAccount(Long id);

}
