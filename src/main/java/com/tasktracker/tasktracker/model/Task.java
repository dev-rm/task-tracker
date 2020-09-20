package com.tasktracker.tasktracker.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity

public class Task {
    private @Id @GeneratedValue Long id;
    private String taskName;
    private @Temporal(TemporalType.TIMESTAMP) Date savedDate;

    public Task() {}

    public Task(String taskName) {
        this.taskName = taskName;
        //this.savedDate = savedDate;
    } 
}
