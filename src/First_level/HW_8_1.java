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

        info_1(string.readLine(), Integer.parseInt(string.readLine()),Integer.parseInt(string.readLine()));

    }
    private static void info (String a) {
        System.out.println("Я зарабатываю - " + a + "$ в час " );
    }

    public static void info_1 (String name, int cost, int year)    {
        System.out.println(name + "Будет получить " + cost + " через " + year + " лет");

    }
}
