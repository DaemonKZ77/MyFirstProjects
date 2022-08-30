package First_level.HW_12_1;

public class HW_12_1_Robot {
    public static void main(String[] args) {
        Robot robot_1 = new Robot("Alex", 10, 50);
        Robot robot_2 = new Robot("IQ", 11, 55);
        Boolean result;
        if (robot_1.fight(robot_2)){
            System.out.println("Робот " + robot_1.getName() + " победил");

        } else {
            System.out.println("Робот " + robot_2.getName() + " победил");

        }
    }


}
