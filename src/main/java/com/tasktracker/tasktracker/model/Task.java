package com.tasktracker.tasktracker.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Task {
    public @Id @GeneratedValue Long id;
    public String taskName;
    @CreationTimestamp 
    @Temporal(TemporalType.TIMESTAMP) 
    public Date savedDate;

    public Task() {}

    public Task(String taskName) {
        this.taskName = taskName;
        //this.savedDate = savedDate;
    }
}
