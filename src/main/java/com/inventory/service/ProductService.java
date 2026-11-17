package com.inventory.service;
import com.inventory.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        if(product == null){
            throw new IllegalArgumentException("Products cannot be null");
        }

        Product normalizedProduct = new Product(
                product.getSku().trim(),
                product.getName(),
                product.getCategory(),
                product.getPrice(),
                product.getStock()
        );

        for (Product existingProduct : products){
            String existingSku = existingProduct.getSku();
            if(existingSku.equalsIgnoreCase(normalizedProduct.getSku())){
                throw new IllegalArgumentException("SKU already exist!");
            }
        }
        products.add(normalizedProduct);
    }

    public List<Product> getAllProducts(){

        return List.copyOf(products);
    }

}
