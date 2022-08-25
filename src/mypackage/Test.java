package mypackage;

import javax.swing.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
      BufferedReader readers = new BufferedReader(new InputStreamReader(System.in));
      String str = readers.readLine();
      int num = Integer.parseInt(str);
        System.out.println("result - " + (num + 2));
      }
      public static int sum (int i,int j) {
        int res;
        res = i+j;
        return res;
      }

}