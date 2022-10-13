package com.example.JavaREST;

import org.springframework.web.bind.annotation.*;

public class OrderController {

    @GetMapping
    public String getOrder() {
        return "Order Name";
    }

    @PostMapping
    public String createOrder(@RequestBody Order order) {

        System.out.println("Recieved an order with name" + order.getOrderName());

        return "created an order with order Id = 1234";

    }
}

