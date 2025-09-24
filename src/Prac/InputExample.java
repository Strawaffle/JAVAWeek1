package Prac;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int one = sc.nextInt();

        System.out.print("두 번째 숫자: ");
        int two = sc.nextInt();

        System.out.print("연산자(+, -, *, /): ");
        String name = sc.nextLine();

        System.out.println("첫 번째 숫자: " + one);
        System.out.println("두 번째 숫자: " + two);
        System.out.println("연산자(+, -, *, /): " + name);
        System.out.println("결과: "+ one + name + two);
        sc.close();
    }
}