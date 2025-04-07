package org.example;
import java.util.*;

public class ShopService {

    ProductRepo productRepo;
    public OrderListRepo orderListRepo = new OrderListRepo();
    public static int orderID;

    public ShopService() {
    }

    public void createOrder(List<String> productIDs) {
        List<Product> products = new ArrayList<>();
        boolean orderSucess = true;
        for (String productID : productIDs) {

            for (Product productInStock: productRepo.getAllProducts()) {
                if (!productInStock.id().equals(productID)) {
                    System.out.println(productInStock.productName() + " is not in stock");
                    orderSucess = false;
                } else {
                    products.add(productInStock);
                }
            }
            if (orderSucess) {
                orderID++;
                Order order = new Order(products, String.valueOf(orderID));
                orderListRepo.addOrder(order);
                System.out.println("Order with OrderID " + order.orderID() + "created.");
            } else {
                System.out.println("Order could not be created.");
            }

        }
    }
}
