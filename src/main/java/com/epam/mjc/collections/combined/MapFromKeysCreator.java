package com.epam.mjc.collections.combined;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> res = new HashMap<>();
        for (String key : sourceMap.keySet()) {
            res.merge(key.length(), new HashSet<>(Set.of(key)), (allSet, newSet) -> {
                allSet.addAll(newSet);
                return allSet;
            });
        }
        return res;
    }
}
