package de.tarent.example.unit1;

import java.util.HashMap;
import java.util.Map;

public class MemStore {
    private Map<String, String> store = new HashMap<>();

    public String get(String name) {
        return store.get(name);
    }

    public void set(String name, String value) {
        if(value != null) {
            store.put(name, value);
        }
    }
}
