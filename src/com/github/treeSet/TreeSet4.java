package com.github.treeSet;

import java.util.TreeSet;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class TreeSet4 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(25);
        set.add(100);
        set.add(1203);
        set.add(-23);
        set.add(1238);

        System.out.println("set.pollFirst() = " + set.pollFirst());
        System.out.println("set.pollLast() = " + set.pollLast());
    }
}
