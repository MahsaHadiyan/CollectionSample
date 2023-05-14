package com.github.treeSet;

import java.util.TreeSet;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class TreeSet7 {

    public static void main(String[] args) {
        // creating objects of the class Employee
        Employee obj1 = new Employee();

        Employee obj2 = new Employee();

        TreeSet<Employee> ts = new TreeSet<Employee>();

   // adding the employee objects to
   // the TreeSet class
        ts.add(obj1);
        ts.add(obj2);

        System.out.println("The program has been executed successfully.");
    }
}
