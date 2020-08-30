package com.sforca.todolist.model;


import lombok.Data;

@Data
public class UserSignInRequestModel {
    private final String username;
    private final String password;
}