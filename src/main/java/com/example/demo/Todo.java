package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=3)
    private String taskName;

    @NotNull
    @Size(min=3)
    private String priority;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dueDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String toString(Date dueDate){
        String pattern="yyyy-MM-dd";
        SimpleDateFormat form= new SimpleDateFormat(pattern);
        String formattedDate = form.format(dueDate);
        return formattedDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
