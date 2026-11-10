package com.inventory.model;
import java.math.BigDecimal;

public class Product {
    private String sku;
    private String name;
    private String category;
    private BigDecimal price;
    private int stock;

    public Product(String sku, String name, String category, BigDecimal price, int stock) {
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        if(sku.isBlank() || name.isBlank() || category.isBlank() || price != null ){
            throw new IllegalArgumentException();
        }

        if(price.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException();
        }

        if(stock < 0){
            throw new IllegalArgumentException();
        }
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    public String getSku() {

        return sku;
    }

    public String getName() {

        return name;
    }

    public String getCategory() {

        return category;
    }

    public BigDecimal getPrice() {

        return price;
    }

    public int getStock() {

        return stock;
    }
}
