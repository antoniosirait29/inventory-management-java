package com.inventory;

import com.inventory.model.Product;
import com.inventory.service.ProductService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Sistem berhasil dijalankan!");

            System.out.println("=== INPUT PRODUCT ===");

            System.out.print("Masukkan nama product: ");
            String name = scanner.nextLine();

            System.out.print("Masukkan ID SKU: ");
            String sku = scanner.nextLine();

            System.out.print("Masukkan nama category: ");
            String category = scanner.nextLine();

            BigDecimal price;
            while (true){
                System.out.print("Masukkan harga product: ");
                String priceOnString = scanner.nextLine();
                try {
                    price = new BigDecimal(priceOnString);
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Input format salah");
                }
            }

            int stock;
            while (true){
                System.out.print("Masukkan stock product: ");
                String stockOnString = scanner.nextLine();
                try {
                    stock = Integer.parseInt(stockOnString);
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Input format salah");
                }

            }



            Product inputProduct = new Product(sku, name, category, price,stock);
            try {
                productService.addProduct(inputProduct);
                System.out.println("Product " + inputProduct.getName() + " Berhasil ditambahkan!");
            } catch (IllegalArgumentException e){
                System.out.println("Gagal menambah produk " + inputProduct.getName() + " || Reason: " + e.getMessage());
            }

            System.out.println("Apakah ingin menambahkan produk lain? (Y/n)");
            String confirmation = scanner.nextLine();
            if(confirmation.equalsIgnoreCase("n")){
                break;
            }
        }
        for (Product product : productService.getAllProducts()) {
            System.out.println(product);
        }

    }
}
