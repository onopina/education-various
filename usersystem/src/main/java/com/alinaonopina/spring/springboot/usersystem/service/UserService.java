package com.alinaonopina.spring.springboot.usersystem.service;

import com.alinaonopina.spring.springboot.usersystem.dao.UserDao;
import com.alinaonopina.spring.springboot.usersystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }
}
