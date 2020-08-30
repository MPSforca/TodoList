package com.sforca.todolist.model;

import lombok.Data;

@Data
public class TaskModel {
    private final Integer id;
    private final String name;
    private final String description;
}
