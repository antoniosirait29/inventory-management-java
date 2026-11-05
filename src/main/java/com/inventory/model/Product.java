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
    }
    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
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
