package com.example.springmongodb.controller;

import com.example.springmongodb.model.Task;
import com.example.springmongodb.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping("/task")
    public String createTask(@RequestBody Task task){
        return service.addTask(task);
    }

    @GetMapping("/task/all")
    public List<Task> getAllTasks() {
        return service.getTask();
    }

    @GetMapping("/{state}")
    public String getTask(@PathVariable String state){
        return service.findTaskByState(state).toString();
    }

}
