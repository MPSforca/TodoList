package com.sforca.todolist.service.impl;

import com.sforca.todolist.dao.UserRepository;
import com.sforca.todolist.model.RegisterUserRequestModel;
import com.sforca.todolist.model.UserModel;
import com.sforca.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(RegisterUserRequestModel registerUserRequestModel) {
        validateFields(registerUserRequestModel);

        UserModel newUser = UserModel.builder()
                .email(registerUserRequestModel.getEmail())
                .username(registerUserRequestModel.getUsername())
                .password(registerUserRequestModel.getPassword())
                .firstName(registerUserRequestModel.getFirstName())
                .lastName(registerUserRequestModel.getLastName())
                .build();

        userRepository.save(newUser);
    }

    private void validateFields(RegisterUserRequestModel registerUserRequestModel) {

    }
}
