package com.lending.lending.services;

import com.lending.lending.model.Transaction;
import com.lending.lending.model.User;
import com.lending.lending.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lending.lending.model.User;
import com.lending.lending.repositories.TransactionRepository;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository lenRepository;

    //CREATE
    public User createUsers(User trn) {
        return lenRepository.save(trn);
    }

    //READ
    public List<User> getUsers() {
        return lenRepository.findAll();
    }

    // DELETE
    public void deleteUsers( Integer Id) {
        lenRepository.deleteById(Id);
    }
}
