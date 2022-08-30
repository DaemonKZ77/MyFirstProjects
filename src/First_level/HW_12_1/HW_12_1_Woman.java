package First_level.HW_12_1;

public class HW_12_1_Woman {
    public static void main(String[] args) {
        Woman owner = new Woman("Аня", 34);
        Cat cat = new Cat("kisa", 25, owner);
        Dog dog = new Dog ("Gav", 10, owner);

        System.out.println(cat.getName() + "  " + cat.getAge());
        System.out.println(cat.getOwner().getName() + "  " + cat.getOwner().getAge() );


    }
}
