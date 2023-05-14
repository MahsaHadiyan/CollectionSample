package com.github.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("test");
        treeSet.add("test1");
        treeSet.add("test2");

        Iterator<String> stringIterator = treeSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println("stringIterator.next() = " + stringIterator.next());
        }
    }
}
