package First_level.HW_12_1;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public Boolean fight (Robot anotherRobot){
        if (this.power > anotherRobot.power){
            return true;
        } else return false;
    }
}
