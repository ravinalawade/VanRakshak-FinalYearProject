package com.example.forestofficerapp;

import java.util.Date;

public class Task {

    private String taskType, taskName, taskDescription, assignedBy;
    private Date taskDeadline;
    
    public Task (String taskType, String taskName, String taskDescription, String assignedBy, Date taskDeadline) {
        this.taskType = taskType;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.assignedBy = assignedBy;
        this.taskDeadline = taskDeadline;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy;
    }

    public Date getTaskDeadline() {
        return taskDeadline;
    }

    public void setTaskDeadline(Date taskDeadline) {
        this.taskDeadline = taskDeadline;
    }
}
