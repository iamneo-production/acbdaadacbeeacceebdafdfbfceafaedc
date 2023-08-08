package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.examly.springapp.model.Task;

public interface TasksRepository extends CrudRepository<Task, String>{
    public Task getTaskbyId(String taskId);
    
}