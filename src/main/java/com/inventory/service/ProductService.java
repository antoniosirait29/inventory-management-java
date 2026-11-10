package com.inventory.service;
import com.inventory.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product){

        for (Product existingProduct : products){
            String existingSku = existingProduct.getSku();

            if(existingSku.equals(product.getSku())){
                throw new IllegalArgumentException("SKU already exist!");
            }
        }
        products.add(product);
    }

    public List<Product> getAllProducts(){

        return List.copyOf(products);
    }

}
