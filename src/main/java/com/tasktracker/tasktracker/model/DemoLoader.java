package com.tasktracker.tasktracker.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner{

    private final TaskRepository repository;

    @Autowired
    public DemoLoader(TaskRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... string) throws Exception {
        this.repository.save(new Task("To read"));
    } 
}
