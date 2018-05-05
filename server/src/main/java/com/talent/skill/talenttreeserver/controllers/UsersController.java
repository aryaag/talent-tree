package com.talent.skill.talenttreeserver.controllers;

import com.talent.skill.talenttreeserver.models.User;
import com.talent.skill.talenttreeserver.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return usersService.getUsers();
    }
}
