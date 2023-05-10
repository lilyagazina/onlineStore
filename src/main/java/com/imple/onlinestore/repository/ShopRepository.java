package com.imple.onlinestore.repository;

import com.imple.onlinestore.model.Item;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ShopRepository {
    private int idCount = 1;
    private final Map<Integer, Item> shop =new HashMap<>();
    @PostConstruct
    public void init(){
        shop.put(idCount, new Item (idCount++,"telephone"));
        shop.put(idCount, new Item (idCount++,"headphones"));
        shop.put(idCount, new Item (idCount++,"printer"));
        shop.put(idCount, new Item (idCount++,"televisor"));
        shop.put(idCount, new Item (idCount++,"fridge"));
    }
    public void add (Item item){
        shop.put(item.getId(), item);
    }
    public Item get(int id){
        return shop.get(id);
    }
    public List<Item> getAll(){
        return new ArrayList<>(shop.values());
    }
    public void update(int id, Item item){
        if (shop.containsKey(id)) {
            shop.replace(id,item);
        }
    }
    public Item delete( int id){
        return shop.remove(id);
    }
}
