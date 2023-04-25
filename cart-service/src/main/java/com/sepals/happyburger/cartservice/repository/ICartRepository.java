package com.sepals.happyburger.cartservice.repository;

import com.sepals.happyburger.cartservice.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartRepository extends JpaRepository<Cart,Integer> {
}
