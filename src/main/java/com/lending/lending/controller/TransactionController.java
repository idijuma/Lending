package com.lending.lending.controller;

import java.util.List;

import com.lending.lending.model.Transaction;
import com.lending.lending.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lending.lending.model.Transaction;
import com.lending.lending.services.TransactionService;

@RestController
@RequestMapping("/api")
public class TransactionController {
    @Autowired
    TransactionService lenService;

    @RequestMapping(value="/transactions", method=RequestMethod.POST)
    public Transaction createTransactions(@RequestBody Transaction trn) {
        return lenService.createTransactions(trn);
    }

    @RequestMapping(value="/transactions", method=RequestMethod.GET)
    public List<Transaction> readTransaction() {
        return lenService.getTransactions();
    }

    @RequestMapping(value="/transactions/{trnId}", method=RequestMethod.DELETE)
    public void deleteTransactions(@PathVariable(value = "trnId") Integer id) {lenService.deleteTransactions(id);
    }

}
