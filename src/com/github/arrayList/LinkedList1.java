package com.github.arrayList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.10   Mahsa
 */
public class LinkedList1 {

    public static void main(String args[]) {

        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        //Traversing the list of elements in reverse order
        Iterator i = ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
