package First_level;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_9_1{
    public static void main(String[] args) throws IOException {
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int num_1 = Integer.parseInt(number.readLine());
        int num_2 = Integer.parseInt(number.readLine());
        int num_3 = Integer.parseInt(number.readLine());
        //Max from 2
        System.out.println(max (num_1, num_2));
        //MIN from 3
        System.out.println(min (num_1, num_2, num_3));
        //MID from 3
        System.out.println(mid (num_1, num_2, num_3));
        //Compare from 2
        System.out.println(compare(num_1));

    }

    public static int max (int a, int b){
        System.out.println("---------------MAX from 2-----------------------");

        int result = a;
        if (b>a) {
            result = b;
        }
        return result;
    }
    public static int min (int a, int b, int c){
        System.out.println("---------------MIN from 3-----------------------");

        int result = Math.min(a, b);
        result = Math.min(result,c);
        return result;
    }
    public static double mid (int a, int b, int c){
        System.out.println("---------------MID from 3-----------------------");

        double result = (a+b+c)/3;
        return result;
    }

    public static String compare (int a){
        System.out.println("---------------COMPARE from 2-----------------------");
        String result = "Число меньше 5";
        if (a>5) {
            result = "Число больше 5";
        } else if (a==5) {
            result = "Число равно 5";
        }
        return result;
    }
}
