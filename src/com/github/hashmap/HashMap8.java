package com.github.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class HashMap8 {

    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"mahsa");
        map.put(235,"hasan");
        map.put(14,"jamal");
        map.put(100,"dirty");

        map.replace(100,"dirty","clean");

        map.entrySet().forEach(System.out::println);
    }
}
