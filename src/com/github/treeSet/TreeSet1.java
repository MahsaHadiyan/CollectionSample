package com.github.treeSet;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * //how to synchronize TreeSet
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();
        Set<String> set = Collections.synchronizedSet(treeSet);
    }
}
