package com.github.linkedHashSet;

import java.util.LinkedHashSet;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class LinkedHashSet3 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("mahsa");
        set.add("ali");
        set.add("atusa");
        set.add("vahid");
        set.add("qamari");
        System.out.println("set = " + set);
        set.remove("qamari");

        System.out.println("set = " + set);
    }

}
