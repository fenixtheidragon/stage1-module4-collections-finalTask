package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> hashMap = new HashMap<>();

        sourceMap.keySet().forEach(a -> hashMap.putIfAbsent(a.length(), new HashSet<>()));

        hashMap.keySet().forEach(a -> {
            sourceMap.keySet().forEach(b -> {
                if (a == b.length()) {
                    hashMap.get(a).add(b);
                }
            });
        });
        return hashMap;
    }
}
