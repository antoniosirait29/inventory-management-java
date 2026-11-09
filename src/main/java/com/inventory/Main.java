package com.inventory;

import com.inventory.model.Product;
import com.inventory.service.ProductService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        List<Product> newProduct = new ArrayList<>();
        ProductService productService = new ProductService();
        while (true){
            System.out.println("Sistem berhasil dijalankan!");

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
            Product inputProduct = new Product(sku, name, category, price,stock);
            newProduct.add(inputProduct);

            for (Product addProduct : newProduct){
                try {
                    productService.addProduct(addProduct);
                    System.out.println("Product " + inputProduct.getName() + " Berhasil ditambahkan!");
                } catch (IllegalArgumentException e){
                    System.out.println("Gagal menambah produk " + inputProduct.getName() + " || Reason: " + e.getMessage());
                }
            }

            System.out.println("Apakah ingin menambahkan produk lain? (Y/n)");
            String confirmation = scanner.nextLine();
            if(confirmation.equalsIgnoreCase("n")){
                for (Product product : productService.getAllProducts()) {
                    System.out.println(product);
                }
                break;
            }
        }

    }
}
