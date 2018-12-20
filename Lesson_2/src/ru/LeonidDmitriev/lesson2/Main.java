package ru.LeonidDmitriev.lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final int col = 4;  // здесь задаем размерность
        final int lin = 4;
        String str[][] = new String[col][lin]; //{{"1","2","4","3"},{"1","2","4","3"},{"1","2","3","4"},{"1","0","3","4"},{"1","2","3","4"}};;

        for (int i=0; i<col; i++)
            for (int j=0; j<lin; j++)
                str[i][j]= "1";       //заполняем массив числами
        str[3][3] = "s"; // испортим массив не целочисленными данными
        str[3][2] = "к";

        try {
            initArray(str);
        } catch (Exception e) {
            new MyArraySizeException("указанная неверная размерность массива, нужно 4х4");
        }

        int sum_str = 0;
        for (int i = 0; i < str.length; i++)
            for (int j = 0; j < str[i].length; j++) {
                try {
                    sum_str +=  Integer.parseInt(str[i][j]);
                } catch (RuntimeException e) {
                    new MyArrayDataException("в столбце " + i + " строке " + j + " не целочисленный элемент" );
                }
            }
        System.out.println("Сумма массива = " + sum_str);
    }


    public static void initArray(String[][] str1){
        String[][] str_control=new String[4][4];
        for (int i=0; i< str1.length; i++)     // сделано специально в цикле
          for (int j=0; j<str1.length; j++)    // чтоб наверняка вызвать ошибку
              str_control[i][j]=str1[i][j];

    }

}

