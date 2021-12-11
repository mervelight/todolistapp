package com.todolist.todolist.service;

import com.todolist.todolist.model.Category;

import java.util.List;

public interface CategoryService {
    void add(Category category);

    void update(Category category);

    void delete(Category category);

    List<Category> getAll();
}
