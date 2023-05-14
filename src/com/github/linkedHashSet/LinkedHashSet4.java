package com.github.linkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class LinkedHashSet4 {
    public static void main(String[] args) {
        LinkedHashSet<Book> hashSet = new LinkedHashSet<Book>();
        Book book = new Book(1, "name", "author", "publisher", 2);
        Book book1 = new Book(2, "name1", "author1", "publisher1", 20);
        Book book2 = new Book(3, "name2", "author2", "publisher2", 22);
        Book book3 = new Book(4, "name3", "author3", "publisher3", 24);
        Book book4 = new Book(5, "name4", "author4", "publisher4", 25);

        hashSet.add(book);
        hashSet.add(book1);
        hashSet.add(book2);
        hashSet.add(book3);
        hashSet.add(book4);

        for (Book b : hashSet) {
            System.out.println("b.name = " + b.name);
            System.out.println("b.author = " + b.author);
            System.out.println("b.publisher = " + b.publisher);

        }

    }
}
