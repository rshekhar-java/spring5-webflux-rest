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
                    .firstName("Ravi")
                    .lastName("Shekhar")
                    .build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Michael")
                    .lastName("Weston")
                    .build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Rupesh")
                    .lastName("Kumar")
                    .build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Mahesh")
                    .lastName("Shaw")
                    .build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Ariff")
                    .lastName("Md")
                    .build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Ryan")
                    .lastName("Wolf")
                    .build()).block();

            System.out.println("Loaded Vendors : "+vendorRepository.count().block());

        }
    }
}
