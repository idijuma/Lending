package com.lending.lending.controller;

import java.util.List;


import com.lending.lending.model.User;
import com.lending.lending.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lending.lending.model.User;
import com.lending.lending.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService lenService;

    @RequestMapping(value="/users", method=RequestMethod.POST)
    public User createUsers(@RequestBody User usr) {
        return lenService.createUsers(usr);
    }

    @RequestMapping(value="/users", method=RequestMethod.GET)
    public List<User> readUsers() {
        return lenService.getUsers();
    }

    @RequestMapping(value="/users/{Id}", method=RequestMethod.DELETE)
    public void deleteUsers(@PathVariable(value = "Id") Integer id) {
        lenService.deleteUsers(id);

    }
}
