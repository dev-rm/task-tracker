package com.tasktracker.tasktracker.model;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>{
    
}
