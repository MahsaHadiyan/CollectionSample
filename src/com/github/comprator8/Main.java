package com.github.comprator8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * //TODO explain Functionality of this class
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.09   Mahsa
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));
        //Sorting elements on the basis of name
        Comparator<Student> cm=Comparator.comparing(Student::getName);

        Collections.sort(al,cm);
        System.out.println("Sorting by Name");
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }


        //Sorting elements on the basis of age
        Comparator<Student> cm2=Comparator.comparing(Student::getAge);
        Collections.sort(al,cm2);
        System.out.println("Sorting by Age");
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }



        ArrayList<Student> al1=new ArrayList<Student>();
        al1.add(new Student(101,"Vijay",23));
        al1.add(new Student(106,"Ajay",27));
        al1.add(new Student(105,null,21));
        Comparator<Student> cm1=Comparator.comparing(Student::getName,Comparator.nullsFirst(String::compareTo));
        Collections.sort(al1,cm1);
        System.out.println("Considers null to be less than non-null");
        for(Student st: al1){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        Comparator<Student> cm3=Comparator.comparing(Student::getName,Comparator.nullsLast(String::compareTo));
        Collections.sort(al1,cm3);
        System.out.println("Considers null to be greater than non-null");
        for(Student st: al1){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}

