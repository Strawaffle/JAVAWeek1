import java.util.Scanner;

public class IfTest
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0){
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }

        System.out.print("숫자를 1에서 7까지 중 하나를 입력해주세요: ");
        int num2 = sc.nextInt();
        switch (num2){
            case 1 :
                System.out.println("월요일");
                break;
            case 2 :
                System.out.println("화요일");
                break;
            case 3 :
                System.out.println("수요일");
                break;
            case 4 :
                System.out.println("목요일");
                break;
            case 5 :
                System.out.println("금요일");
                break;
            case 6 :
                System.out.println("토요일");
                break;
            case 7 :
                System.out.println("일요일");
                break;
            default :
                System.out.println("올바르지 않은 숫자입니다.");
        }

        System.out.print("점수를 입력해주세요: ");
        int num3 = sc.nextInt();
        if (num3 >= 90){
            System.out.println("A");
        }
        else if (num3 >= 80){
            System.out.println("B");
        }
        else if (num3 >= 70){
            System.out.println("C");
        }
        else if (num3 >= 60){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

        System.out.print("첫 번째 숫자를 입력해주세요: ");
        int num4 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력해주세요: ");
        int num5 = sc.nextInt();
        System.out.print("사용하실 연산자를 입력해주세요: ");
        String o = sc.next();

        switch (o){
            case "+":
                System.out.println(num4 + num5);
                break;
            case "-":
                System.out.println(num4 - num5);
                break;
            case "*":
                System.out.println(num4 * num5);
                break;
            case "/":
                System.out.println(num4 / num5);
                break;
            default :
                System.out.println("잘못된 수식입니다/");
        }

        System.out.print("나이를 입력해주세요: ");
        int num6 = sc.nextInt();
        if (num6 >= 18){
            System.out.println("성인입니다");
        }
        else {
            System.out.println("미성년자입니다");
        }

        System.out.print("연도를 입력해주세요: ");
        int num7 = sc.nextInt();
        if (num7 % 4 == 0 || num7 % 100 == 1 ||  num7 % 400 == 0){
            System.out.println("윤년입니다.");
        }
        else {
            System.out.println("윤년이 아닙니다.");
        }

        System.out.print("월을 입력해주세요: ");
        int num8 = sc.nextInt();
        switch (num8){
            case 12, 1, 2 :
                System.out.println("겨울");
                break;
            case 3, 4, 5 :
                System.out.println("봄");
                break;
            case 6, 7, 8 :
                System.out.println("여름");
                break;
            case 9, 10, 11 :
                System.out.println("가을");
                break;
            default :
                System.out.println("올바르지 않은 월입니다.");
        }

        System.out.print("키를 입력해주세요: ");
        int num9 = sc.nextInt();
        System.out.print("몸무게를 입력해주세요: ");
        int num10 = sc.nextInt();
        if (num10 / (num9 * num9) >= 30){
            System.out.println("비만입니다");
        }
        else if (num10 / (num9 * num9) >= 25){
            System.out.println("과체중입니다");
        }
        else if (num10 / (num9 * num9) >= 18.5){
            System.out.println("정상입니다");
        }
        else if (num10 / (num9 * num9) <= 18.5){
            System.out.println("저체중입니다");
        }
    }
}
