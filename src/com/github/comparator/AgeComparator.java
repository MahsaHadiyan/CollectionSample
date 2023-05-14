package com.github.comparator;

import java.util.Comparator;

/**
 * //TODO explain Functionality of this class
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.09   Mahsa
 */
public class AgeComparator implements Comparator {

    public int compare(Object o1,Object o2){
        Student s1=(Student)o1;
        Student s2=(Student)o2;

        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
