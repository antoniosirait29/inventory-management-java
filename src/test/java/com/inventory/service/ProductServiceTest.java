package com.inventory.service;

import com.inventory.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {
    private ProductService productService;

    @BeforeEach
    void setup(){
        productService = new ProductService();
    }

    @Test
    void shouldAddProductSuccessfully(){
        Product product = new Product("KCPMNS", "Kecap Manis 60ml", "Makanan", new BigDecimal("7000.00"), 100);

        productService.addProduct(product);

        assertEquals(1, productService.getAllProducts().size(), "Product should be successfully added!");
    }

    @Test
    void shouldThrowExceptionSkuAlreadyExist(){
        Product product1 = new Product("KCPMNS", "Kecap Manis 60ml", "Makanan", new BigDecimal("7000.00"), 100);

        productService.addProduct(product1);

        Product product2 = new Product("KCPMNS", "Kecap Manis 100ml", "Makanan", new BigDecimal("7000.00"), 100);

        assertThrows(IllegalArgumentException.class, ()->{
            productService.addProduct(product2);
        });

        assertEquals(1, productService.getAllProducts().size(), "Product size should be 1");

    }

    @Test
    void shouldReturnAllProducts(){
        Product product1 = new Product("KCPMNS", "Kecap Manis 60ml", "Makanan", new BigDecimal("7000.00"), 100);

        productService.addProduct(product1);

        Product product2 = new Product("KCPASN", "Kecap Asin 60ml", "Makanan", new BigDecimal("7000.00"), 100);

        productService.addProduct(product2);

        List<Product> containerProduct = productService.getAllProducts();

        assertEquals(2, containerProduct.size(), "The list should contain 2 products");
    }

    @Test

    void shouldReturnEmptyListWhenNoProductsExist(){
        assertTrue(productService.getAllProducts().isEmpty());
    }

    @Test
    void shouldThrowExceptionWhenProductsIsNull(){
        assertThrows(IllegalArgumentException.class, ()->{
            productService.addProduct(null);
        });
    }

    @Test
    void shouldRejectDuplicateSkuRegardlessOfCase(){
        Product product1 = new Product("KCPMNS", "Kecap Manis 60ml", "Makanan", new BigDecimal("7000.00"), 100);

        productService.addProduct(product1);

        Product product2 = new Product(" kcpmns", "Kecap Manis 100ml", "Makanan", new BigDecimal("7000.00"), 100);


        assertThrows(IllegalArgumentException.class, ()->{
            productService.addProduct(product2);
        });
    }


}
