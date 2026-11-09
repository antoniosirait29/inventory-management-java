package com.inventory;

import com.inventory.model.Product;
import com.inventory.service.ProductService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Sistem berhasil dijalankan!");
        ProductService productService = new ProductService();

        System.out.println("=== INPUT PRODUCT ===");

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

        for (Product product : productService.getAllProducts()) {
            System.out.println(product);
        }
    }
}
