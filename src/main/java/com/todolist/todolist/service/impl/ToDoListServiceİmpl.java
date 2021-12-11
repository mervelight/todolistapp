package com.todolist.todolist.service.impl;

import com.todolist.todolist.model.ToDoList;
import com.todolist.todolist.repository.ToDoListRepository;
import com.todolist.todolist.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class ToDoListServiceİmpl implements ToDoListService {
    private ToDoListRepository toDoListRepository;

    @Autowired
    public ToDoListServiceİmpl(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    @Override
    @Transactional
    public List<ToDoList> getAll() {
        return this.toDoListRepository.findAll();
    }

    @Override
    public void add(ToDoList toDoList) {
        this.toDoListRepository.save(toDoList);
    }

    @Override
    public void update(ToDoList toDoList) {
    }

    @Override
    public void delete(ToDoList toDoList) {
        this.toDoListRepository.delete(toDoList);
    }

}
