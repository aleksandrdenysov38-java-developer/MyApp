package lesson15;

import java.util.Scanner;

public class AdviceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeekAdvisor advisor = new WeekAdvisor();

        System.out.println("Enter day (from Monday till Sunday: ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            Day day = Day.valueOf(input);
            advisor.advise(day);
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect day's name. Please, enter correct day's name");
        }

        scanner.close();
    }
}
