package com.github.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class HashSet4 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("mahsa");
        list.add("maryam");
        list.add("mahnaz");
        list.add("mohana");
        HashSet<String> set=new HashSet<>(list);
        set.add("mobina");
        System.out.println("set = " + set);

    }
}
