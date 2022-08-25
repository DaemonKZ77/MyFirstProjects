package object_homework;

public class Human {
    private String name;
    private Boolean gender;
    private int age;

    Human father;
    Human mother;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        String str;
        str="Имя:" + this.name;
        return str;
    }
}
