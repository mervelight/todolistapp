package com.todolist.todolist.service.impl;

import com.todolist.todolist.model.Category;
import com.todolist.todolist.repository.CategoryRepository;
import com.todolist.todolist.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CategoryServiceİmpl implements CategoryService {


    private CategoryRepository categoryRepository;

    public CategoryServiceİmpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void add(Category category) {
        this.categoryRepository.save(category);
    }

    @Override
    public void update(Category category) {
    }

    @Override
    @Transactional
    public void delete(Category category) {
        this.categoryRepository.delete(category);
    }

    @Override
    @Transactional
    public List<Category> getAll() {
        return this.categoryRepository.findAll();
    }
}
