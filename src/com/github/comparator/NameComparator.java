package com.github.comparator;

import java.util.Comparator;

/**
 * //TODO explain Functionality of this class
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.09   Mahsa
 */
public class NameComparator implements Comparator {

    public int compare(Object o1,Object o2){
        Student s1=(Student)o1;
        Student s2=(Student)o2;

        return s1.name.compareTo(s2.name);
    }
}
