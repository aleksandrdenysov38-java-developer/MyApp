package lesson4;

public class App {
    public static void main(String[] args) {

        int days1 = 5;
        float sales1 = 12153.41f;
        int days2= 7;
        float sales2 = 10486.85f;

        float salesByDay1 = sales1 / days1;
        float salesByDay2 = sales2 / days2;



        System.out.printf("Product No 1: smartphone, \ntotal sales for %d days is EUR %.2f, \n" +
                "sales by day is EUR %.2f.\n", days1, sales1, salesByDay1);
        System.out.printf("Product No 2: laptop,  \ntotal sales for %d days is EUR %.2f, "
                + '\n' + "sales by day is EUR %.2f.", days2, sales2, salesByDay2);

    }
}
