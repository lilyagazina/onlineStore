package com.imple.onlinestore.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class ShoppingBasket {
    private final Set<Integer> ids = new HashSet<>();

        public void add(Set<Integer> id) {
            ids.addAll(id);
        }

        public Set<Integer> get() {
            return Collections.unmodifiableSet(ids);
        }


    public Set<Integer> getAll() {
        return ids;
    }

    public void addAll(Collection<Integer> values) {
        ids.addAll(values);
    }


}
