package First_level.HW_14_1;

public class Human {
    String name;
    Boolean gender;
    int age;

    Human father;
    Human mather;

    public Human (String name, Boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Human (String name, Boolean gender, int age, Human father, Human mather) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mather = mather;
    }

    @Override
    public String toString(){
       String result;

        return null;
    }

}
