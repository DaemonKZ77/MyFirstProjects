package First_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_8_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число - ");
        String cost = string.readLine();
        info(cost);

    }
    private static void info (String a) {
        System.out.println("Я зарабатываю - " + a + "$ в час " );
    }
}
