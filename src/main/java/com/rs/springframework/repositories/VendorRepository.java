package com.rs.springframework.repositories;

import com.rs.springframework.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * created by rs 2/27/2022.
 */
public interface VendorRepository extends ReactiveMongoRepository<Vendor,String> {
}
