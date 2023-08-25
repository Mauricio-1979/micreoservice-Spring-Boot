package com.mauriziodeveloper.orders_service.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sku;
    private Double price;
    private Long quantity;

    // relation many to one with order
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
