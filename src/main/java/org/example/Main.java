package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //initialize order and product list
        OrderListRepo orderListRepo = new OrderListRepo();
        ProductRepo productRepo = new ProductRepo();

        //initialize service
        ShopService shopService = new ShopService(orderListRepo, productRepo);

        // create and add products to the list
        Product apple      = new Product("Apple",      "10", 4,  130);
        Product banana     = new Product("Banana",     "11", 2,   50);
        Product orange     = new Product("Orange",     "12", 6,   80);
        Product grape      = new Product("Grape",      "13", 3,   90);
        Product kiwi       = new Product("Kiwi",       "14", 5,  120);
        Product mango      = new Product("Mango",      "15", 2,  150);
        Product strawberry = new Product("Strawberry", "16", 8,  100);
        Product pineapple  = new Product("Pineapple",  "17", 4,  200);
        Product watermelon = new Product("Watermelon", "18", 1,  300);
        Product lemon      = new Product("Lemon",      "19", 4,   70);


        productRepo.addProducts(apple);
        productRepo.addProducts(banana);
        productRepo.addProducts(orange);
        productRepo.addProducts(grape);
        productRepo.addProducts(kiwi);
        productRepo.addProducts(mango);
        productRepo.addProducts(strawberry);
        productRepo.addProducts(pineapple);
        productRepo.addProducts(watermelon);
        productRepo.addProducts(lemon);


        Map<String, Integer> orderMap1 = new HashMap<String, Integer>();
        orderMap1.put("10",30);
        orderMap1.put("17",30);
        orderMap1.put("11",30);

        Map<String, Integer> orderMap2 = new HashMap<String, Integer>();
        orderMap2.put("102",300);
        orderMap2.put("17",300);
        orderMap2.put("11",300);

        shopService.createOrder(orderMap1);

        shopService.createOrder(orderMap2);




    }
}