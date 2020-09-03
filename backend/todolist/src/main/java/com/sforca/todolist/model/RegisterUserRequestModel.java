package com.sforca.todolist.model;

import lombok.Data;

@Data
public class RegisterUserRequestModel {
    private final String email;
    private final String username;
    private final String password;
    private final String passwordConfirmation;
    private final String firstName;
    private final String lastName;
}
