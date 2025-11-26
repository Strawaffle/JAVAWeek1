package Prac;

import java.util.Scanner;

public class Array {
    public static   void main(String args[]) {
        int[] numbers = new int[5];
        int[] array =  {10, 20, 30, 40, 50};

        System.out.println(numbers.length);
        System.out.println(array.length);

        System.out.println(array[0]);
        System.out.println(array[4]);

        int[] oldArray = {1, 2, 3};
        int[] newArray = new int[5];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

        System.out.println("=============================");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("=============================");

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

    }
}
