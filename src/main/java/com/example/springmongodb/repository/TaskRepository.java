package com.example.springmongodb.repository;

import com.example.springmongodb.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task,Long> {
}
