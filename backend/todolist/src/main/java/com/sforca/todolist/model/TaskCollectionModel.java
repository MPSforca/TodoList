package com.sforca.todolist.model;

import lombok.Data;
import java.util.List;

@Data
public class TaskCollectionModel {
    private final String id;
    private final String name;
    private final String creatorId;
    private final Boolean isPrivate;
    private final List<TaskModel> tasks;
}
