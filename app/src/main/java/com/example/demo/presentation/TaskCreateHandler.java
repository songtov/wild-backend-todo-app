package com.example.demo.presentation;

import com.example.demo.application.Task;
import com.example.demo.application.TaskCreator;

public class TaskCreateHandler extends ResourceMethodHandler {

    public static final String KEY = "POST /tasks";

    private final TaskCreator taskCreator = new TaskCreator();

    @Override
    public String handle(String content) {
        // 어떤 형식으로 인풋을 받을 것인가?
        // 일단 , 로 나누가:

        String[] values = content.split(",");
        // todo_app 같은 경우에는 내부로직이 없는데 어떻게 애플리케이션을 나누는가?

        Task task = taskCreator.create(values[0], values[1]);

        String result = task.getTaskName() + " " + task.getTaskDescription();

        return result;

    }
}
