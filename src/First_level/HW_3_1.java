package First_level;

public class HW_3_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Метод Sum - " + sum(a, b));
        System.out.println("Метод Mutliply - " + multiply (a, b));
        System.out.println("Метод Subt - " + subt (a, b));
        System.out.println("Метод Devision - " + div (a, b));
        /*-------------------------------------------------------------------------------------*/

        System.out.println("SECOND BLOCK");
        float eu = 50;
        System.out.println("Курс доллара к " + eu + "евро  - " + convert (eu));

    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }
    public static int subt (int a, int b) {
        int result = a-b;
        return result;
    }
    public static float div (int a, int b) {
        float result = a/b;
        return result;
    }

    /*SECOND BLOCK*/
public static float convert (float euro){
    float course = 50;
    float result = euro * course;
    return result;
}
}