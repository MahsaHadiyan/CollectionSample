package com.github.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class Hashmap2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "mahsa");
        map.put(2, "mahsa");
        map.put(3, "mahsa");

        for (Map.Entry m : map.entrySet()) {
            System.out.println("m = " + m);
        }
        ;
    }
}
