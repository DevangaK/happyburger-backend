package com.sepals.happyburger.cartservice.service;

import com.sepals.happyburger.cartservice.model.Cart;
import com.sepals.happyburger.cartservice.repository.ICartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private ICartRepository cartRepository;

    public Cart saveCart(Cart cart){
        return cartRepository.save(cart);
    }
}
