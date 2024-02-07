package com.example;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<Integer, Person> mapData = new HashMap<>();
        mapData.put(1, new Person("riya"));
        mapData.put(2, new Person("sony"));
        mapData.put(3, new Person("liya"));

        System.out.println(mapData);
        System.out.println(mapData.get(1));
        System.out.println(mapData.size());
        System.out.println(mapData.containsKey(4));
        System.out.println(mapData.keySet());
        System.out.println(mapData.entrySet());

        mapData.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        mapData.forEach((key, person) -> System.out.println(key + " - " + person));

        mapData.remove(3);
        System.out.println(mapData);

        System.out.println(mapData.getOrDefault(3, new Person("default")));

        System.out.println(mapData.values());

    }

    record Person(String name) {

    }
}
