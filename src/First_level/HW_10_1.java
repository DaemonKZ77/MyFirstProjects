package First_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_10_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        1
        int i = 0;
        while (i<10) {
            System.out.println(Integer.toString(i));
            i++;
        }

        while (i>0) {
            System.out.println(Integer.toString(i));
            i--;
        }
        double result;
        for (int j = 0; j < 100; j++) {
            result = (double)j/2;

            if (result == (int)result) {
                System.out.println(j);
            }

        }
        System.out.println("Finish");
        String string = reader.readLine();
        String number = reader.readLine();

        for (int k = 0; k < Integer.parseInt(number) ; k++) {
            System.out.print(string + " ");

        }
    }



}
