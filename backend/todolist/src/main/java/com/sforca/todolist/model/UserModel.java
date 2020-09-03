package com.sforca.todolist.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("users")
public class UserModel {
    @Id
    private final String id;
    private final String username;
    private final String password;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final List<TaskCollectionInformationModel> createdTaskCollections;
    private final List<TaskCollectionInformationModel> starredTaskCollections;
}
