package com.talent.skill.talenttreeserver.services;

import com.talent.skill.talenttreeserver.models.User;
import com.talent.skill.talenttreeserver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.getUsers();
    }
}
