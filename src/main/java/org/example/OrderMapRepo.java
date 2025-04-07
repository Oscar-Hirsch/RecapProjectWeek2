package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {

    Map<String, Order> orders = new HashMap<>();

    public OrderMapRepo() {

    }

    @Override
    public void addOrder(Order order) {
        String id = order.orderID();
        orders.put(id, order);
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order.orderID());
    }

    @Override
    public Order getSingleOrder(String id) {
        return orders.get(id);
    }
    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }
}
