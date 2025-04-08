package org.example;
import java.util.*;

public class ShopService {

    ProductRepo productRepo;
    public OrderListRepo orderListRepo;
    public static int orderID;

    public ShopService(OrderListRepo orderListRepo, ProductRepo productRepo) {
        this.orderListRepo = orderListRepo;
        this.productRepo = productRepo;
    }

    public void createOrder(Map<String, Integer> productIDs) {
        List<Product> products = new ArrayList<>();
        boolean orderSucess = true;
        for (String productID : productIDs.keySet()) {
            Product product = productRepo.getSingleProduct(productID);
            if (product == null) {
                orderSucess = false;
                break;
            } else {
                if (productIDs.get(productID) <= product.quantity()) {
                    products.add(product);
                    Product updatedProduct = new Product(product.productName(), product.id(), product.price(), product.quantity());
                    productRepo.addProducts(updatedProduct);
                } else {
                    orderSucess = false;
                    break;
                }

            }
        }

        if (orderSucess) {
            orderID++;
            Order order = new Order(products, String.valueOf(orderID));
            orderListRepo.addOrder(order);
            System.out.println("Order with OrderID=" + order.orderID() + " created.");
        } else {
            System.out.println("Order could not be created.");
        }
    }
}
