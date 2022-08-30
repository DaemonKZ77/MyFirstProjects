package First_level.HW_12_1;

public class Dog {
    private String name;
    private int age;
    private Woman owner;

    public Dog(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Woman getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }
}