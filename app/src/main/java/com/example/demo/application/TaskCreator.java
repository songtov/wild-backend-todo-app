package com.example.demo.application;

import com.example.demo.infrastructure.Task;

public class TaskCreator {

    public Task create(String taskName, String taskDescription) {
        Task task = new Task(taskName, taskDescription);
        return task;
    }
}
