package com.skypro.shop_auto.service;

import com.skypro.shop_auto.repository.CartBasket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private final CartBasket basket;
    public CartService(CartBasket cartRepository){
        this.basket=cartRepository;
    }
    public void addToCart(List<Integer>ids){
        this.basket.addToCart(ids);

    }
    public List<Integer> getCart(){
        return this.basket.getCart();
    }


}
