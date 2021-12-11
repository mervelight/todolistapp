package com.todolist.todolist.service;

import com.todolist.todolist.model.ToDoList;

import java.util.List;

public interface ToDoListService {
    List<ToDoList> getAll();

    void add(ToDoList toDoList);

    void update(ToDoList toDoList);

    void delete(ToDoList toDoList);

}
