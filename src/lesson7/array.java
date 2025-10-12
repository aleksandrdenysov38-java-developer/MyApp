package lesson7;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class array {
    public static void main(String[] args) {
            int[] myArray = new int[20];
            Random random = new Random();
            int min = -100;
            int max = 100;
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = random.nextInt(max - min + 1) + min;
            }
        System.out.println("Элементы массива: " + Arrays.toString(myArray));

      //  int[] myArray = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
        int sumOfNegatives = Arrays.stream(myArray).filter(number -> number < 0).sum();
        System.out.println("Сумма отрицательных чисел: " + sumOfNegatives);

        int evenCount = 0;
        for (int number : myArray) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Количество четных чисел: " + evenCount);

        int oddCount = 0;
        for (int number : myArray) {
            if (number % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Количество нечетных чисел: " + oddCount);

        int minIndex = 0;
        int minValue = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minValue) {
                minValue = myArray[i];
                minIndex = i;
            }
        }
        System.out.println("Наименьший элемент: " + minValue + " (с индексом " + minIndex + ")");

        int maxIndex = 0;
        int maxValue = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
                maxIndex = i;
            }
        }
        System.out.println("Наибольший элемент: " + maxValue + " (с индексом " + maxIndex + ")");


        double average = calculateAverageAfterNegative(myArray);
        System.out.println("Среднее арифметическое чисел после первого отрицательного числа: " + average);
    }

    public static double calculateAverageAfterNegative(int[] myArray) {
        int firstNegativeIndex = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1 || firstNegativeIndex == myArray.length - 1) {

        }

        double sum = 0;
        int count = 0;
        for (int i = firstNegativeIndex + 1; i < myArray.length; i++) {
            sum += myArray[i];
            count++;
        }

        if (count == 0) {
            return 0.0; // Нет элементов после первого отрицательного
        }

        return sum / count;




    }
}
