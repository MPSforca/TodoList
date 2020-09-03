package com.sforca.todolist.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document("users")
public class UserModel {
    @Id
    private String email;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    @Builder.Default
    private List<TaskCollectionInformationModel> createdTaskCollections = null;
    @Builder.Default
    private List<TaskCollectionInformationModel> starredTaskCollections = null;
}
