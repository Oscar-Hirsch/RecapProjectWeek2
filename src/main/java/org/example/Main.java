package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //initialize order and product list
        OrderListRepo orderListRepo = new OrderListRepo();
        ProductRepo productRepo = new ProductRepo();

        //initialize service
        ShopService shopService = new ShopService(orderListRepo, productRepo);

        // create and add products to the list
        Product apple      = new Product("Apple", "10");
        Product banana     = new Product("Banana", "11");
        Product orange     = new Product("Orange", "12");
        Product grape      = new Product("Grape", "13");
        Product kiwi       = new Product("Kiwi",  "14");
        Product mango      = new Product("Mango", "15");
        Product strawberry = new Product("Strawberry","16");
        Product pineapple  = new Product("Pineapple","17");
        Product watermelon = new Product("Watermelon","18");
        Product lemon      = new Product("Lemon","19");

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




        //creat order list
        List<String> healthyList = List.of("10", "17", "11");
        shopService.createOrder(healthyList);

        List<String> healthyList2 = List.of("102", "17", "11");
        shopService.createOrder(healthyList2);

        List<String> healthyList3 = List.of("16", "17", "11");
        shopService.createOrder(healthyList3);



    }
}