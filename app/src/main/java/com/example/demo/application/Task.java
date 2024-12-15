package com.example.demo.application;

public class Task {

    private String taskName;

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getTaskName() {
        return taskName;
    }

    private String taskDescription;

    public Task(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

}
