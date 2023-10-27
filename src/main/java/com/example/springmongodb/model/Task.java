package com.example.springmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.lang.annotation.Target;

@Document(collation = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @Field(targetType = FieldType.STRING)
    private String taskId;
    private String description;
    private String severity;
    private String assignee;
    private String state;
}
