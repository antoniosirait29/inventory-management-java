package com.inventory.model;

import com.inventory.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {
    private ProductService productService;

    @BeforeEach
    void setup(){
        productService = new ProductService();
    }

    @Test
    void shouldThrowExceptionWhenSkuContainsOnlyWhiteSpace(){

        assertThrows(IllegalArgumentException.class, ()->{
            Product product1 = new Product("   ", "Kecap Manis 60ml", "Makanan", new BigDecimal("7000.00"), 100);
            productService.addProduct(product1);
        });
    }
}
