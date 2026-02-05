package com.lab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Inventory<T> {

    private Set<T> items;

    public Inventory() {
        items = new HashSet<>();
    }

    // Adds an item to the inventory (no duplicates)
    public void add(T item) {
        items.add(item);
    }

    // Checks if an item exists
    public boolean contains(T item) {
        return items.contains(item);
    }

    // Returns all items as an ArrayList
    public List<T> getAll() {
        return new ArrayList<>(items);
    }
}
