package com.example.springmongodb.repository;

import com.example.springmongodb.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends MongoRepository<Task,Long> {
    List<Task> findByState(String state);
}
