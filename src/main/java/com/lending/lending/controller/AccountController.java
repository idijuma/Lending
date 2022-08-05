package com.lending.lending.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lending.lending.model.Account;
import com.lending.lending.services.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    AccountService lenService;

    @RequestMapping(value="/account", method=RequestMethod.POST)
    public Account createAccounts(@RequestBody Account acc) {
        return lenService.createAccounts(acc);
    }
    @RequestMapping(value="/account", method=RequestMethod.GET)
    public List<Account> readAccount() {
        return lenService.getAccounts();
    }

    @RequestMapping(value="/account/{accId}", method=RequestMethod.DELETE)
    public void deleteAccount(@PathVariable(value = "accId") Long id) {
        lenService.deleteAccounts(id);
    }

}
