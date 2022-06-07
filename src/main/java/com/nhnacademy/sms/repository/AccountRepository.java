package com.nhnacademy.sms.repository;

import com.nhnacademy.sms.domain.Account;

import java.util.List;

public interface AccountRepository {

    List<Account> findAll();

}
