package com.sforca.todolist.controller;

import com.sforca.todolist.model.RegisterUserRequestModel;
import com.sforca.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void registerUser(RegisterUserRequestModel registerUserRequestModel) {

    }

}
