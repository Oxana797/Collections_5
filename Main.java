package com.example.mydemo.task5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    System.out.println("Task 4");
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "one");
    map.put(2, "two");
    map.put(3, "three");
    map.put(4, "four");

    // We use the already existing key with a new value here.
    // The new value will overwrite the old value.
    map.put(4, "four-2");

    // We use the already existing value here with a new key.
    // Finally, there will be two keys with the same value.
    map.put(5, "one");

    iterateOverValues(map);
    iterateOverKeys(map);
    iterateOverPair(map);
  }

  public static void iterateOverValues(Map<Integer, String> map) {
    System.out.println("Iteration over values...");
    Collection<String> values = map.values();
    for(String value : values) {
      System.out.println(value);
    }
  }

  public static void iterateOverKeys(Map<Integer, String> map) {
    System.out.println("Iteration over keys...");
    Set<Integer> keys = map.keySet();
    for(int key : keys) {
      System.out.println(key + ": " + map.get(key));
    }
  }

  public static void iterateOverPair(Map<Integer, String> map) {
    System.out.println("Iteration over entries...");
    Set<Map.Entry<Integer, String>> pairs =  map.entrySet();
    for(Map.Entry<Integer, String> pair : pairs) {
      System.out.println(pair.getKey() + ": " + pair.getValue());
    }
  }

}
