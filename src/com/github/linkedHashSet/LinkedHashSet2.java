package com.github.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Mahsa");
        linkedHashSet.add("Mahsa");
        linkedHashSet.add("fateme");
        linkedHashSet.add("zahra");
        linkedHashSet.add("jafar");

        Iterator<String> iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
