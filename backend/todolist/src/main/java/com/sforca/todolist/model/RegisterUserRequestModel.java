package com.sforca.todolist.model;

import lombok.Data;

@Data
public class RegisterUserRequestModel {
    private final String username;
    private final String password;
    private final String passwordConfirmation;
    private final String email;
    private final String name;
    private final String surname;
}
