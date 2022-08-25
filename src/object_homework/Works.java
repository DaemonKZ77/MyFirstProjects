package object_homework;

public class Works {
    public static void main(String[] args) {
        Human test = new Human();
        Human gf_1 = new Human( );   // дедушка 1
        Human gf_2 = new Human();   // дедушка 2
        Human gm_1 = new Human();   // бабушка 1
        Human gm_2 = new Human();   // бабушка 2
        Human mather = new Human();   // бабушка 2
        Human father = new Human();   // бабушка 2

        gf_1.setAge(55);
        gf_1.setName("Маруся");
        gf_1.setGender(true);

        System.out.println(gf_1.toString());
    }
}
