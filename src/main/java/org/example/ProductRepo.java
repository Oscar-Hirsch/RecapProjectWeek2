package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {

    List<Product> products = new ArrayList<>();

    public ProductRepo() {
    }

    public void addProducts(Product product) {
        products.add(product);
    }

    public void removeProducts(Product product) {
        products.remove(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getSingleProduct(String name) {
        for (Product product : products) {
            if (product.productName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
