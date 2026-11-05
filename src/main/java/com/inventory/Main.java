package com.inventory;

import com.inventory.model.Product;
import com.inventory.service.ProductService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Product product1 = new Product("SAUS", "Saus Sambal", "Makanan",  new BigDecimal("5000.0"), 100);
        Product product2 = new Product("KCPMNS", "Kecap Manis", "Makanan", new BigDecimal("6000.0"), 100);
        Product product3 = new Product("KCPASN", "Kecap Asin", "Makanan", new BigDecimal("6500.0"), 100);

        ProductService productService = new ProductService();
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);

        System.out.println(productService.getAllProducts());
        System.out.println("Sistem berhasil dijalankan");



    }
}
