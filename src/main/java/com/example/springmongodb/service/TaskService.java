package com.example.springmongodb.service;

import com.example.springmongodb.model.Task;
import com.example.springmongodb.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    //Add Task

    public String addTask(Task task){
        repository.save(task);
        return "Task Added";
    }

    // get all Task

    public List<Task> getTask(){
        return repository.findAll();
    }

    public List<Task> findTaskByState(String state){
        return repository.findByState(state);
    }
}
