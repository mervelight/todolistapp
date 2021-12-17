package com.todolist.todolist.controller;

import com.todolist.todolist.model.Category;
import com.todolist.todolist.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/list")
    public List<Category> get() {
        return categoryService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Category user) {
        categoryService.delete(user);
    }

    @PostMapping("/add")
    public void add(@RequestBody Category category) {
        categoryService.add(category);
    }

}
