package com.github.hashset;

import java.util.HashSet;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class HashSet5 {
    public static void main(String[] args) {
        HashSet<Book> set = new HashSet<Book>();

        Book book = new Book(1, "test", "author", "publisher", 2);
        Book book1 = new Book(2, "test1", "author1", "publisher1", 2);
        Book book2 = new Book(3, "test2", "author2", "publisher2", 2);
        Book book3 = new Book(4, "test3", "author3", "publisher3", 2);
        Book book4 = new Book(5, "test4", "author4", "publisher4", 2);

        set.add(book);
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);
        for(Book b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
