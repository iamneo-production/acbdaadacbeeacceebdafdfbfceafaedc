package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Task;
import com.examly.springapp.repository.TasksRepository;

@Service
public class TasksService{
    @Autowired
    TasksRepository tasksRepository;

    public List<Task> getAllTasks(){
        return(List<Task>) tasksRepository.findAll();
    }

    public Task getTaskById(String taskId){
        return tasksRepository.findById(taskId).orElse(null);
    }


    public void saveTask(Task task){
        tasksRepository.save(task);
    }

    public void delete(String taskId){
        tasksRepository.deleteById(taskId);
    }
    public void updateTaskStatus(Task task){
        tasksRepository.save(task);
    }
}