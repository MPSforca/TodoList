package com.sforca.todolist.model;

import lombok.Data;
import java.util.List;

@Data
public class TaskCollectionInformationModel {
    private final String taskCollectionId;
    private final List<String> completedTasks;
}
