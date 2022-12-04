

package com.skypro.shop_auto.controller;

import com.skypro.shop_auto.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("order")
public class OrderController {
    //- У контроллера должны быть два метода:
    ///store/order/add
    ///store/order/get
    //- При обращении к методу add можно в качестве параметров запроса передавать один или несколько чисел,
    // которые являются ID некоего товара.
    //- При get мы должны получить все добавленные ID в виде списка в JSON-формате.
    //- Для каждого подключения нового клиента должен создаваться новый объект — корзина.
    //- Никаких хранилищ всех корзин быть не должно.
    private final CartService cartService;
    public OrderController(CartService cartService){
        this.cartService=cartService;
    }
        @GetMapping("/get")
        public List<Integer> get(){
        return this.cartService.getCart();
        }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids){
        this.cartService.addToCart(ids);
    }

}
