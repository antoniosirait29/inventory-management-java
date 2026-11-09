package com.inventory;

import com.inventory.model.Product;
import com.inventory.service.ProductService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Sistem berhasil dijalankan!");

//        Product product1 = new Product("SAUS", "Saus Sambal", "Makanan",  new BigDecimal("5000.0"), 100);
//        Product product2 = new Product("SAUS", "Saus Sambal", "Makanan",  new BigDecimal("5000.0"), 100);
//        Product product3 = new Product("KCPASN", "Kecap Asin", "Makanan", new BigDecimal("6500.0"), 100);
//        Product product4 = new Product("KCPASN", "Kecap Asin", "Makanan", new BigDecimal("6500.0"), 100);
//
//        productList.add(product1);
//        productList.add(product2);
//        productList.add(product3);
//        productList.add(product4);
//
        ProductService productService = new ProductService();
//
//        for (Product product : productList){
//            try {
//                productService.addProduct(product);
//                System.out.println("Produk " + product.getName() + " berhasil ditambahkan!");
//            } catch (IllegalArgumentException e){
//                System.out.println("Gagal menambah produk " + product.getName() + " || Reason: " + e.getMessage());
//            }
//        }
        System.out.println("=== INPUT PRODUCT ===");

        List<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama product: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan ID SKU: ");
        String sku = scanner.nextLine();

        System.out.print("Masukkan nama category: ");
        String category = scanner.nextLine();

        System.out.print("Masukkan harga product: ");
        String priceOnString = scanner.nextLine();
        BigDecimal price = new BigDecimal(priceOnString);

        System.out.print("Masukkan stock product: ");
        String stockOnString = scanner.nextLine();
        int stock = Integer.parseInt(stockOnString);

        Product product1 = new Product(sku, name, category, price,stock);

        try {
            productService.addProduct(product1);
            System.out.println("Product " + product1.getName() + " Berhasil ditambahkan!");
        } catch (IllegalArgumentException e){
            System.out.println("Gagal menambah produk " + product1.getName() + " || Reason: " + e.getMessage());
        }

        //System.out.println(productService.getAllProducts());

        for (Product product : productService.getAllProducts()) {
            System.out.println(product);
        }
    }
}
