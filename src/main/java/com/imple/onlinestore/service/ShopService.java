package com.imple.onlinestore.service;

import com.imple.onlinestore.component.ShoppingBasket;
import com.imple.onlinestore.model.Item;
import com.imple.onlinestore.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ShopService {
    private final ShoppingBasket shoppingBasket;
    private final ShopRepository shopRepository;

    public ShopService(ShoppingBasket shoppingBasket, ShopRepository shopRepository) {
        this.shoppingBasket = shoppingBasket;
        this.shopRepository = shopRepository;
    }

    public void add(Set <Integer> id) {
        shoppingBasket.add(id);
    }

    public List<Item> get() {
        return shoppingBasket.get().stream()
                .map(shopRepository::get)
                .collect(Collectors.toList());
    }
}
