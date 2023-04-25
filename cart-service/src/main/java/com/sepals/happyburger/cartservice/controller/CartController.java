package com.sepals.happyburger.cartservice.controller;

import com.sepals.happyburger.cartservice.model.Cart;
import com.sepals.happyburger.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/addCart")
    public Cart addCart(@RequestBody Cart cart){
        return cartService.saveCart(cart);
    }
}
