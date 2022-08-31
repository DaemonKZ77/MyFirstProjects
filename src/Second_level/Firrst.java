package Second_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Firrst {
    public static void main(String[] args) throws IOException {
        BufferedReader str_read = new BufferedReader(new InputStreamReader(System.in));

        //Объявление переменных
        int studentCount;
        String studentData;
        float midleScore;
        String[] studentDataParse = new String[0];

        System.out.println("Укажите количество учеников - ");
        studentCount = Integer.parseInt(str_read.readLine());

        Student [] students = new Student[studentCount];


        for (int i = 0; i < studentCount; i++) {
            System.out.println("Укажите данные ученика " + i + " - Имя Фамилия Оценка1 Оценка2 Оценка3" );
            studentData = str_read.readLine();
            studentDataParse = studentData.split(" ");
            midleScore = (Integer.parseInt(studentDataParse[2]) + Integer.parseInt(studentDataParse[3]) + Integer.parseInt(studentDataParse[4]))/3;
            System.out.println(midleScore);
            students[i] = new Student(studentDataParse[0], studentDataParse[1], 3.75);
        }
      }

    class Student{
        private String lastName;
        private String name;
        private int[] ball;
        private float midleScore;

        public Student(String lastName, String name, float midleScore) {
            this.lastName = lastName;
            this.name = name;
            this.ball = ball;
            this.midleScore = midleScore;
        }

        public float getMidleBal() {
            return midleScore;
        }
    }
}
