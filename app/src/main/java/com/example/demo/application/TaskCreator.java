package com.example.demo.application;

public class TaskCreator {

    public Task create(String taskName, String taskDescription) {
        Task task = new Task(taskName, taskDescription);
        return task;
    }
}
