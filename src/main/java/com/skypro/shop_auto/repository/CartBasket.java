

package com.skypro.shop_auto.repository;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class CartBasket {
    private final List<Integer> idList=new ArrayList<>();
    public void addToCart(List<Integer>ids){
        this.idList.addAll(ids);
    }
    public List<Integer>getCart(){
        return this.idList;
    }
}
