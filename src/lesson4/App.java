package lesson4;

public class App {
    public static void main(String[] args) {
        String template = """
                Product No %d : %s,
                total sales for %d days is EUR %.2f,
                sales by day is EUR %.2f.
                """;
        String textForClient1 = template.formatted(1, "smartphone", 5, 12153.41, 2430.68);
        String textForClient2 = template.formatted(2, "laptop", 7, 10486.85, 1498.12);

        System.out.println(textForClient1);
        System.out.println(textForClient2);
    }
}
