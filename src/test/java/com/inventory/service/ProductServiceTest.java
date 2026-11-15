package com.inventory.service;

import com.inventory.model.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ProductServiceTest {
    private ProductService productService;

    @BeforeEach
    void setup(){
        productService = new ProductService();
    }

    @Test
    void inputProduct(){
        Product product1 = new Product("KCPMNS", "Kecap Manis 60ml", "Makanan", new BigDecimal("7000.00"), 100);
        productService.addProduct(product1);
    }

    @Test
    void getProduct(){
        productService.getAllProducts();
    }

}
