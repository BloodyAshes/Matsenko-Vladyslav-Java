package Algorithms;

import java.util.Scanner;

public class Algorithms {

    private static Scanner scan = new Scanner(System.in);

    private static void isNumberBigger() {
        int number;

        System.out.println("Введите пожалуйста число");

        number = scan.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }

    private static void isNameEqual() {
        String name;

        System.out.println("Введите пожалуйста ваше имя");

        name = scan.next();

        if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.err.println("Такого имени нет");
        }
    }

    private static void isMultiBy(){
        int[] numbers = {5, 8, 3, 25, 28, 48, 50, 90, 66, 87};

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 3 == 0){
                System.out.println(numbers[i]);
            }
        }

    }

    private static void closeScanner(){
        scan.close();
    }

    public static void main(String[] args) {
        isNumberBigger();
        isNameEqual();
        isMultiBy();
        closeScanner();
    }
}
