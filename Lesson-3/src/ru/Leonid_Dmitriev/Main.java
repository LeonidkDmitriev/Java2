package ru.Leonid_Dmitriev;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        final int n=5; //размерность справочника
        String[] str1 ={"123","321","222","333","111"}; //номера телефонов
        String[] str2 ={"Иванов","Петров","Сидоров","Петров","Скакунов"}; //фамилии
        ArrayList<String> words = new ArrayList<>(); //

        System.out.println("ПУНКТ ПЕРВЫЙ ЗАДАНИЯ ");
        duplicate(words); // метод где будет происходить отсечения повторов и подсчет слов

        System.out.println("ПУНКТ ВТОРОЙ ЗАДАНИЯ ");
        for (int i=0; i<n; i++) {
            Phonebook.addPhonebook(str1[i],str2[i]); //добавляем в книгу
        }
        Phonebook.getPhonebook(str2[1]); //знаем все телефоны на данную фамилию

    }

    private static void duplicate(ArrayList<String> words) {
        HashSet<String> uniqueWords = new HashSet<>();

        words.add("слово1");
        words.add("слово2");
        words.add("слово3");
        words.add("слово3");
        words.add("слово2");
        words.add("слово4");
        words.add("слово5");
        words.add("слово6");
        words.add("слово7");
        words.add("слово7");

        for (String str: words){ // передаем в List, чтобы отсечь ненужное
            uniqueWords.add(str);
        }
        System.out.println(uniqueWords);
        for (String str: uniqueWords) {      // находим сколько раз повторяются слова
            int i=0;
            for (String str1:words) {
               if (str==str1) i++;
            }
            System.out.println("Слово " + str + " встречается " + i + " раз");
        }
    }
}

