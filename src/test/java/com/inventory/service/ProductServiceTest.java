package com.inventory.service;

import com.inventory.model.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {
    private ProductService productService;

    @BeforeEach
    void setup(){
        productService = new ProductService();
    }

    @Test
    void shouldAddProductSuccessfully(){
        Product product1 = new Product("KCPMNS", "Kecap Manis 60ml", "Makanan", new BigDecimal("7000.00"), 100);

        productService.addProduct(product1);

        assertEquals(1, productService.getAllProducts().size());


    }

}
