package mypackage;

import com.sun.tools.javac.Main;

public class Work {
    public static void main(String[] args) {
        System.out.println(Test.sum(5, 35));

        User persons = new User();
        persons.age = 12;
        persons.gender = 1;
        persons.name = "Dmitry";
    }
}
