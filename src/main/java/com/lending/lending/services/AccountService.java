package com.lending.lending.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lending.lending.model.Account;
import com.lending.lending.repositories.AccountRepository;
import java.util.List;

@Service
public class AccountService {
    @Autowired
      AccountRepository lenRepository;

   //CREATE
    public  Account createAccounts(Account acc) {
        return lenRepository.save(acc);
    }

    //READ
    public List<Account> getAccounts() {
        return lenRepository.findAll();
    }

    // DELETE
    public void deleteAccounts(Long accId) {
        lenRepository.deleteById(accId);
    }


}

