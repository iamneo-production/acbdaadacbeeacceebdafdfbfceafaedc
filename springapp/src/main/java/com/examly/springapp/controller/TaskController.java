package com.examly.springapp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.service.TaskService;

@RestController
public class TaskController {

    @Autowired
    TasksService tasksService;

    @GetMapping("/altasks")
    public List<Task> getAllTasks(){
        return tasksService.getAllTasks();
    }

    @GetMapping("/getTask/{taskId}")
    public Task getTask(@pathVariable("taskId") String taskId){
        return tasksService.getTaskbyId(taskId);
    }

    @DeleteMapping("/deleteTask/{taskId}")
    public void deleteTask(@pathVariable("taskId")String taskId){
        tasksService.delete(taskId);
    }

    @PostMapping("/saveTask")
    public String saveTask(@RequestBody Task task){
        tasksService.saveTask(task);
        return task.getTaskId();
    }

    @PutMapping("/changeStatus")
    public Task updateTaskStatus(@RequestBody Task task){
        tasksService.updateTaskStatus();
        return task;
    }
}