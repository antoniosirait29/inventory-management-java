package com.inventory;

import com.inventory.model.Product;
import com.inventory.service.ProductService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        System.out.println("Sistem berhasil dijalankan!");

        Product product1 = new Product("SAUS", "Saus Sambal", "Makanan",  new BigDecimal("5000.0"), 100);
        Product product2 = new Product("SAUS", "Saus Sambal", "Makanan",  new BigDecimal("5000.0"), 100);
        Product product3 = new Product("KCPASN", "Kecap Asin", "Makanan", new BigDecimal("6500.0"), 100);
        Product product4 = new Product("KCPASN", "Kecap Asin", "Makanan", new BigDecimal("6500.0"), 100);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        ProductService productService = new ProductService();

        for (Product product : productList){
            try {
                productService.addProduct(product);
                System.out.println("Produk " + product.getName() + " berhasil ditambahkan!");
            } catch (IllegalArgumentException e){
                System.out.println("Gagal menambah produk " + product.getName() + " || Reason: " + e.getMessage());
            }
        }


        //System.out.println(productService.getAllProducts());

        for (Product product : productService.getAllProducts()) {
            System.out.println(product);
        }
    }
}
