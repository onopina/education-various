package com.alinaonopina.spring.springboot.usersystem.dao;

import com.alinaonopina.spring.springboot.usersystem.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {
    private List<User> users = Arrays.asList(new User("admin", "admin"),
            new User("user1", "user1"));


    public List<User> getAllUsers(){
        return users;
    }

}
