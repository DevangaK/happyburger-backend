package com.sepals.happyburger.cartservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cart")
public class Cart {
    @GeneratedValue
    @Id
    private int order_id;
    private int burger_id;
    private int quantity;
    private double total_price;
    private String customer_name;
    private int customer_contact_number;
    private String customer_address;
}
