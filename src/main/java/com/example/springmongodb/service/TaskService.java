package com.example.springmongodb.service;

import com.example.springmongodb.model.Task;
import com.example.springmongodb.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public String addTask(Task task){
        task.setTaskId((long) Math.floor(Math.random()));
        repository.save(task);
        return "Task Added";
    }
}
