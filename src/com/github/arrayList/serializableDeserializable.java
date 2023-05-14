package com.github.arrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.10   Mahsa
 */
public class serializableDeserializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Mahsa");
        al.add("Mohammad");
        al.add("Ali");

        //Serialization
        FileOutputStream fileOutputStream=new FileOutputStream("file");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(al);
        objectOutputStream.close();
        fileOutputStream.close();

        //Deserializable
        FileInputStream fileInputStream=new FileInputStream("file");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        ArrayList<String> list=(ArrayList) objectInputStream.readObject();
        for (String o : list) {
            System.out.println("o = " + o);
        }
    }
}
