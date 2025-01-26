package com.myfirstwebapp.todo_web_application.todo;

import java.time.LocalDate;

//Database(MySQL)
//Static List of todos => Database(H2, MySQL)
public class Todo {
    //    id
//    username
//    description
//    targetDate
//    done
    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean isDone;

    public Todo(int id, String username, String description, LocalDate targetDate, boolean isDone) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "Todo{" + "id=" + id + ", username='" + username + '\'' + ", description='" + description + '\'' + ", targetDate=" + targetDate + ", isDone=" + isDone + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
