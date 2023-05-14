package com.github.arrayList;

import java.util.ArrayList;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.10   Mahsa
 */
public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);
    }
}
