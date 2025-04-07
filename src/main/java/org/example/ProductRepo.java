package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {

    public List<Product> products = new ArrayList<>();

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

    public Product getSingleProduct(String id) {
        for (Product product : products) {
            if (product.id().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
