package lesson12;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(
                "Product Ownerovich",
                "Engineer",
                "productownerovich@gmail.com",
                "0931111111",
                35
        );

        System.out.println(emp);


        Car car = new Car();
        car.start();
    }
}
