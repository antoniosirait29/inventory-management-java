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

            String name = "";
            while (true){
                System.out.print("Masukkan nama product: ");
                name = scanner.nextLine();
                if (name.isBlank()){
                    System.out.println("Nama tidak boleh kosong!");
                    continue;
                }
                    break;
            }

            String sku = "";
            while (true){
                System.out.print("Masukkan ID SKU: ");
                sku = scanner.nextLine();
                if(sku.isBlank()){
                    System.out.println("SKU tidak boleh kosong!");
                    continue;
                }
                break;
            }

            String category = "";
            while (true){
                System.out.print("Masukkan nama category: ");
                category = scanner.nextLine();
                if (category.isBlank()){
                    System.out.println("Category tidak boleh kosong!");
                    continue;
                }
                break;
            }


            BigDecimal price;
            while (true){
                System.out.print("Masukkan harga product: ");
                String priceOnString = scanner.nextLine();
                try {
                    price = new BigDecimal(priceOnString);
                    if (price.compareTo(BigDecimal.ZERO) <= 0){
                        System.out.println("Harga harus lebih besar dari 0!");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Harga harus berupa angka yang valid!");
                }
            }

            int stock;
            while (true){
                System.out.print("Masukkan stock product: ");
                String stockOnString = scanner.nextLine();
                try {
                    stock = Integer.parseInt(stockOnString);
                    if(stock < 0){
                        System.out.println("Stock tidak boleh minus!");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Stok harus berupa bilangan bulat!");
                }
            }

            Product inputProduct;
            try {
                inputProduct = new Product(sku, name, category, price,stock);
                productService.addProduct(inputProduct);
                System.out.println("Product " + inputProduct.getName() + " Berhasil ditambahkan!");
            } catch (IllegalArgumentException e){
                System.out.println("Gagal menambah produk " + name + " || Reason: " + e.getMessage());
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
