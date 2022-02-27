package com.rs.springframework.repositories;

import com.rs.springframework.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * created by rs 2/27/2022.
 */
public interface CategoryRepository extends ReactiveMongoRepository<Category,String> {
}
