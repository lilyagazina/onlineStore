package com.imple.onlinestore.controller;

import com.imple.onlinestore.model.Item;
import com.imple.onlinestore.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/order")
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam("id") Set <Integer> ids) {
        shopService.add(ids);
    }


    @GetMapping(path = "/get")
    public List<Item> get() {
        return shopService.get();
    }
}
