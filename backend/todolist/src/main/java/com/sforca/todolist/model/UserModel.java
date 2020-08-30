package com.sforca.todolist.model;

import lombok.Data;
import java.util.List;

@Data
public class UserModel {
    private final String id;
    private final String username;
    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final List<TaskCollectionInformationModel> createdTaskCollections;
    private final List<TaskCollectionInformationModel> starredTaskCollections;
}
