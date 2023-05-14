package com.github.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class HashSet2 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        //ignoring duplicate element
        set.add("ali");
        set.add("mahsa");
        set.add("hasn");
        set.add("ali");
        set.add("reza");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println("i.next() = " + i.next());
        }
    }
}
