package mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        System.out.println();
        for (int i = 0; i < ; i++) {

        }
        BufferedReader str_num = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Укажите количество чисел для сравнения");
        int count = Integer.parseInt(str_num.readLine());
        compare(count);
        Arrays.sort;
        /*int[] numArray = new int[count];*/
      /*  ArrayList numlist = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            System.out.println("Введите число - " + i);
            numlist.add (Integer.parseInt(str_num.readLine()));
        }*/
       /* for (int i = 0; i < count; i++) {
            System.out.println("Введите число - " + i);
            numArray[i] = Integer.parseInt(str_num.readLine());
        }
        int result = numArray[0];
        for (int j = 0; j < count-1; j++) {
            if (result>numArray[j]){
                result = numArray[j];
            }
        }*/

  /*      int num_2 = Integer.parseInt(str_num.readLine());
        int num_3 = Integer.parseInt(str_num.readLine());


        if (num_1<num_2) {
            result = num_1;
        } else result = num_2;

        if (num_3<result){
            result=num_3;
        }*/
/*
        System.out.println(Collections.max(numlist));
    }*/
    }
    public static void compare (int s) {
        if (s < 5) {
            System.out.println("число меньше 5");
        } else if (s>5){
            System.out.println("Число больше 5");
        } else if (s==5) {
            System.out.println("Число = 5");
        }
    }
}
