package com.todolist.todolist.controller;

import com.todolist.todolist.model.ToDoList;
import com.todolist.todolist.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odev")
public class ToDoListController {
    private final ToDoListService toDoListService;

    @Autowired
    public ToDoListController(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    @GetMapping("/list")
    public List<ToDoList> get() {
        return this.toDoListService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody ToDoList toDoList) {
        this.toDoListService.delete(toDoList);
    }

    @PostMapping("/add")
    public void add(@RequestBody ToDoList toDoList) {
        this.toDoListService.add(toDoList);
    }
}
