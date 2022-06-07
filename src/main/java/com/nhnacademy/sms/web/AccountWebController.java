package com.nhnacademy.sms.web;

import com.nhnacademy.sms.service.account.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class AccountWebController {

    private final AccountService accountService;

    @GetMapping("/web/accounts/{id}")
    public ModelAndView getAccount(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView("account");
        mav.addObject("account", accountService.getAccount(id).orElseThrow());

        return mav;
    }

}
