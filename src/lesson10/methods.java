package lesson10;

import java.util.Scanner;
import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        printSquare(number);


        System.out.print("\nВведите радиус цилиндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введите высоту цилиндра: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.printf("Объем цилиндра = %.2f%n", volume);


        int[] numbers = {10, 20, 30, 40, 50};
        int sum = sumArray(numbers);
        System.out.println("Массив чисел: " + Arrays.toString(numbers));
        System.out.println("\nСумма всех элементов массива равняется " + sum);


        scanner.nextLine();
        System.out.print("\nВведите строку: ");
        String text = scanner.nextLine();
        String reversed = reverseString(text);
        System.out.println("Строка в обратном порядке: " + reversed);


        System.out.print("\nВведите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        int power = power(a, b);
        System.out.println(a + " ^ " + b + " = " + power);


        System.out.print("\nВведите целое число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите текстовую строку: ");
        String repeatText = scanner.nextLine();
        repeatTextNTimes(n, repeatText);

        scanner.close();
    }


    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа " + number + " равняется " + square);
    }


    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }


    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }


    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }


    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }


    public static void repeatTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}



