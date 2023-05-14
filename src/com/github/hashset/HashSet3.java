package com.github.hashset;

import java.util.HashSet;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class HashSet3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("mahsa");
        set.add("milad");
        set.add("reza");
        set.add("fateme");
        set.add("mohammad");
        set.add("hasan");

        System.out.println("set = " + set);

        set.remove("mahsa");
        System.out.println("set after removing element = " + set);

        HashSet<String> set1 = new HashSet<>();
        set1.add("judith");
        set1.add("borna");
        set.addAll(set1);

        System.out.println("set = " + set);

        set.removeAll(set1);
        System.out.println("set = " + set);
        set.removeIf(s -> s.contains("m"));
        System.out.println("set = " + set);
        set.clear();
        System.out.println("set = " + set);
    }
}
