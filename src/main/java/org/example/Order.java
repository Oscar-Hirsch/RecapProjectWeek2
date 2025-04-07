package org.example;
import java.util.List;

public record Order(List<Product> product, String orderID) {
}
