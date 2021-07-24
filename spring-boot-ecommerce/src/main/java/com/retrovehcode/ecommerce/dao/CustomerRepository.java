package com.retrovehcode.ecommerce.dao;

import com.retrovehcode.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
