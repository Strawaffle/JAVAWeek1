package Prac;

public class DataTypesExample {
    public static void main(String[] args) {
        int temperature = 20;
        final int FREEZING_POINT = 0; //상수선언

        temperature = 25;
        System.out.println("Current temperature: " + temperature);

        System.out.println("freezing point of water: " + FREEZING_POINT);
    }
}
