package com.github.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.10   Mahsa
 */
public class SortArrayList {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        Collections.sort(list1);
        for (String s : list1) {
            System.out.println(s);
        }

        List<Integer> list2=new ArrayList<Integer>();
        list2.add(100);
        list2.add(22);
        list2.add(33);
        list2.add(2);
        Collections.sort(list2);
        for (Integer s : list2) {
            System.out.println(s);
        }
    }
}
