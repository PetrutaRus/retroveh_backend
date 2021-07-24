package com.retrovehcode.ecommerce.dto;

import com.retrovehcode.ecommerce.entity.Address;
import com.retrovehcode.ecommerce.entity.Customer;
import com.retrovehcode.ecommerce.entity.Order;
import com.retrovehcode.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
