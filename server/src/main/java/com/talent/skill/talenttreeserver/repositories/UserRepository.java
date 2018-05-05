package com.talent.skill.talenttreeserver.repositories;

import com.talent.skill.talenttreeserver.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getUsers() {
        return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<User>(User.class));
    }
}
