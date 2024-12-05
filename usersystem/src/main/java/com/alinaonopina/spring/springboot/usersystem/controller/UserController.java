package com.alinaonopina.spring.springboot.usersystem.controller;

import com.alinaonopina.spring.springboot.usersystem.model.User;
import com.alinaonopina.spring.springboot.usersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "check", method = RequestMethod.POST)
    public @ResponseBody String checkUser(@ModelAttribute("userFromServer") User user){

       if ("admin".equals(user.getName()) && "admin".equals(user.getPassword())) {
           return "valid";
       }
       else return  "invalid";
    }
}
