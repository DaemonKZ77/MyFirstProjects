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
}
