package com.example.JavaREST;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String orderName;
    private String shippingAddress;
    private String shippingStatus;
}
