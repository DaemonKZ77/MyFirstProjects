package First_level.HW_12_1;

public class Cat {
    private String name;
    private int age;
    private Woman owner;

    public Cat(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Woman getOwner() {
        return owner;
    }
}

