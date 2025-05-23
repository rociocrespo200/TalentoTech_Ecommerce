package com.techlab.domain.repositories;

import java.util.ArrayList;

import com.techlab.domain.models.Cart;

public interface ICartRepository {
    void addToCart(Integer productId, Integer quantity);
    void removeFromCart(Integer productId);
    void clearCart();
    ArrayList<Cart> getAllProducts();
    double getTotalPrice();
    void checkout();
    void viewCart();
}
