package com.example.springmongodb.controller;

import com.example.springmongodb.model.Task;
import com.example.springmongodb.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping("/task")
    public String createTask(@RequestBody Task task){
        return service.addTask(task);
    }
}
