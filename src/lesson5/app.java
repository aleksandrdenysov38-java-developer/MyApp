package lesson5;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your salary please");
        double salary = scanner.nextInt();

        if (salary >0 && salary <= 10000) {
            double tax1 = salary * 0.025;
            System.out.println("tax amount:" + tax1);
        }
        if (salary > 10000 && salary <= 25000) {
            double tax2 = salary * 0.043;
            System.out.println("tax amount:" + tax2);
        }
        if (salary > 25000) {
            double tax3 = salary* 0.067;
            System.out.println("tax amount:" + tax3);
        }
    }
}
