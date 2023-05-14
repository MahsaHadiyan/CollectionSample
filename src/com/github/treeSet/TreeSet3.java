package com.github.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("ALi");
        set.add("mahsa");
        set.add("reza");
        set.add("hasan");
        set.add("20");

        Iterator<String> iterator = set.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
