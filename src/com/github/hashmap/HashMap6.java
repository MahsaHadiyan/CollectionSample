package com.github.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class HashMap6 {

    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(10,"ali");
        map.put(102,"amin");
        map.put(105,"hasan");
        map.put(1,"sina");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
