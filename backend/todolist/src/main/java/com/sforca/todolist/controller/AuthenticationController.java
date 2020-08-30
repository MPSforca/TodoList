package com.sforca.todolist.controller;

import com.sforca.todolist.model.UserSignInRequestModel;
import com.sforca.todolist.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/sign-in")
    public void signIn(UserSignInRequestModel userAuthenticationRequestModel) {
    }

    @PostMapping("/sign-out")
    public void signOut(String username) {
    }
}
