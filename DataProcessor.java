package com.lab;

import java.util.Collection;

public class DataProcessor {

    public static <T> int countItems(Collection<T> collection) {
        return collection.size();
    }
}
