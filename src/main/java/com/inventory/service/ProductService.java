package com.inventory.service;
import com.inventory.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        for (int i = 0; i < products.size(); i++){
            Product productIndex = products.get(i);
            String existingProduct = productIndex.getSku();
            if(existingProduct.equals(product.getSku())){
                throw new IllegalArgumentException("SKU already exists");
            }
        }
        products.add(product);
    }

    public List<Product> getAllProducts(){

        return List.copyOf(products);
    }

}
