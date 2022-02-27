package com.rs.springframework.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * created by rs 2/26/2022.
 */
@Data
@Document
public class Category {
    @Id
    private String id;

    private String description;
}
