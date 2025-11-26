package Prac;

public class MaxArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                System.out.println(i + "번째 값 : " + numbers[i]);
                max = numbers[i];
            }

        }

        System.out.println("최대 값은? : "+max);
    }
}
