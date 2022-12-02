package Algorithms;

import java.util.Scanner;

public class Algorithms {

    private Scanner scan = new Scanner(System.in);

    private void isNumberBigger() {
        int number;

        System.out.println("Введите пожалуйста число");

        number = scan.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }

    private void isNameEqual() {
        String name;

        System.out.println("Введите пожалуйста ваше имя");

        name = scan.next();

        if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.err.println("Такого имени нет");
        }
    }

    private void isMultiBy(){
        int[] numbers = {5, 8, 3, 25, 28, 48, 50, 90, 66, 87};

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 3 == 0){
                System.out.println(numbers[i]);
            }
        }

    }

    public static void main(String[] args) {
        Algorithms algorithms = new Algorithms();

        algorithms.isNumberBigger();

        algorithms.isNameEqual();

        algorithms.isMultiBy();
    }
}
