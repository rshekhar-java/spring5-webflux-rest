package com.rs.springframework.bootstrap;

import com.rs.springframework.domain.Category;
import com.rs.springframework.domain.Vendor;
import com.rs.springframework.repositories.CategoryRepository;
import com.rs.springframework.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * created by rs 2/27/2022.
 */
@Component
public class Bootstrap implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (categoryRepository.count().block() == 0){
            //load data
            System.out.println("######## LOADING DATA ON BOOTSTRAP ##########");

            categoryRepository.save(Category.builder()
                    .description("Fruits").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Nuts").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Breads").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Meats").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Eggs").build()).block();

            System.out.println("Loaded Categories : "+categoryRepository.count().block());

            vendorRepository.save(Vendor.builder()
                    .firstname("Ravi")
                    .lastname("Shekhar")
                    .build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstname("Michael")
                    .lastname("Weston")
                    .build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstname("Rupesh")
                    .lastname("Kumar")
                    .build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstname("Mahesh")
                    .lastname("Shaw")
                    .build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstname("Ariff")
                    .lastname("Md")
                    .build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstname("Ryan")
                    .lastname("Wolf")
                    .build()).block();

            System.out.println("Loaded Vendors : "+vendorRepository.count().block());

        }
    }
}
