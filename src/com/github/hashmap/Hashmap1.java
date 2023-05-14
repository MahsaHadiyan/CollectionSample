package com.github.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class Hashmap1 {

    public static void main(String[] args) {
        Map map = new HashMap();
        //Adding elements to map
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");

        Iterator iterator = map.values().iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
