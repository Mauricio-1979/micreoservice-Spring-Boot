package com.mauriziodeveloper.orders_service.repositories;

import com.mauriziodeveloper.orders_service.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
