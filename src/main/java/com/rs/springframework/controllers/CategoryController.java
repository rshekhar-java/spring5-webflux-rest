package com.rs.springframework.controllers;

import com.rs.springframework.domain.Category;
import com.rs.springframework.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * created by rs 2/27/2022.
 */
@RestController
public class CategoryController {
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/api/v1/categories")
    Flux<Category> list(){
        return categoryRepository.findAll();
    }
    @GetMapping("/api/v1/categories/{id}")
    Mono<Category>getByID(@PathVariable String id){
        return categoryRepository.findById(id);
    }
}
