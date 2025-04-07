package org.example;
import java.util.List;

public interface OrderRepo {

    public void addOrder(Order order);
    public void removeOrder(Order order);
    public Order getSingleOrder(String id);
    public List<Order> getAllOrders();
}
