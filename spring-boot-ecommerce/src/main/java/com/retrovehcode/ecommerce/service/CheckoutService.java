package com.retrovehcode.ecommerce.service;

import com.retrovehcode.ecommerce.dto.Purchase;
import com.retrovehcode.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
