package lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class arraylesson8 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        Random random = new Random();
        int min = 1;
        int max = 100;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.println("Начальный вид массива: " + Arrays.toString(myArray));

        for (int i = 1; i < myArray.length; i++) {
            int key = myArray[i];
            int j = i - 1;


            while (j >= 0 && myArray[j] > key) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }


            myArray[j + 1] = key;


        }
        System.out.println("Отсортированный массив: " + Arrays.toString(myArray));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int target = scanner.nextInt();


        int index = binarySearch(myArray, target);


        if (index != -1) {
            System.out.println("Индекс числа:  " + target + " в отсортированном массиве: " + index);
        } else {
            System.out.println("Число " + target + " не найдено в массиве");
        }

        scanner.close();
    }
}


