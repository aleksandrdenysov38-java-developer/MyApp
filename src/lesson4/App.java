package lesson4;

public class App {
    public static void main(String[] args) {
        String template = """
                Product No %d : %s,
                total sales for %d days is EUR %.2f,
                sales by day is EUR %.2f.
                """;
        int days1 = 5;
        float sales1 = 12153.41f;
        int days2= 7;
        float sales2 = 10486.85f;

        float salesByDay1 = sales1 / days1;
        float salesByDay2 = sales2 / days2;

        String textForClient1 = template.formatted(1, "smartphone", days1, sales1, salesByDay1);
        String textForClient2 = template.formatted(2, "laptop", days2, sales2, salesByDay2);

        System.out.println(textForClient1);
        System.out.println(textForClient2);
    }
}
