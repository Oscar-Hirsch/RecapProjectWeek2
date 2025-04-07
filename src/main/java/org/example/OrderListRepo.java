package org.example;
import java.util.*;

public class OrderListRepo {

    public List<Order> orders = new ArrayList<>();

    public OrderListRepo() {
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order getSingleOrder(String id) {
        for (Order order : orders) {
            if(order.orderID().equals(id)) {
                return order;
            }
        }
        return null;
    }



}
