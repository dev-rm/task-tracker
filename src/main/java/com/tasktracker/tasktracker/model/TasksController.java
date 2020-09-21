package com.tasktracker.tasktracker.model;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class TasksController {
    private TaskRepository taskRepository;

    public TasksController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/tasks")
    List<Task> tasks() {
        return (List<Task>) taskRepository.findAll();
    }

    @PostMapping("/tasks")
    ResponseEntity<Task> createTask(@RequestBody Task task) throws URISyntaxException {
        Task result = taskRepository.save(task);
        return ResponseEntity.ok().body(result);
    }
}
