package com.lending.lending.services;

import com.lending.lending.model.Transaction;
import com.lending.lending.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lending.lending.model.Transaction;
import com.lending.lending.repositories.TransactionRepository;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository lenRepository;

    //CREATE
    public Transaction createTransactions(Transaction trn) {
        return lenRepository.save(trn);
    }

    //READ
    public List<Transaction> getTransactions() {
        return lenRepository.findAll();
    }

    // DELETE
    public void deleteTransactions( Integer trnId) {
        lenRepository.deleteById(trnId);
    }

}
