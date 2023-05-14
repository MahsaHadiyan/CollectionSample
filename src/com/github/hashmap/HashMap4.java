package com.github.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class HashMap4 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "mahsa");
        map.put(1, "hasan");
        map.put(120, "jamal");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}
