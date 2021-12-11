package com.todolist.todolist.controller;

import com.todolist.todolist.model.Category;
import com.todolist.todolist.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {


    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/list")
    public List<Category> get() {
        return this.categoryService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Category user) {
        this.categoryService.delete(user);
    }

    @PostMapping("/add")
    public void add(@RequestBody Category category) {
        this.categoryService.add(category);
    }
}
