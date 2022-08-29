package First_level;

public class HW_10_1 {
    public static void main(String[] args) {
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
    }



}
