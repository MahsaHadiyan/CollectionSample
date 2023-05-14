package com.github.treeSet;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class Employee {


    int empId;
    String name;

    // getting the name of the employee
    String getName() {
        return this.name;
    }

    // setting the name of the employee
    void setName(String name) {
        this.name = name;
    }

    // setting the employee id
    // of the employee
    void setId(int a) {
        this.empId = a;
    }

    // retrieving the employee id of
    // the employee
    int getId() {
        return this.empId;
    }
}
