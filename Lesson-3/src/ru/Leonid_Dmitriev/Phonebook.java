package ru.Leonid_Dmitriev;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
   public static  HashMap<String, String> book = new HashMap<>(); //ключом будет являться телефонный номер


    public static void addPhonebook(String number, String surname) {
       book.put(number,surname);
    }

    public static void getPhonebook(String surname) {
        for (Map.Entry<String,String> entry: book.entrySet()) {
            if (entry.getValue()==surname) System.out.println(" Фамилия " +surname + " Номер "+entry.getKey());
            
        }
        System.out.println(book);
    }

}
