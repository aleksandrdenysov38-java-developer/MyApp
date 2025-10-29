package lesson11;

public class app {
    public static void main(String[] args) {

        Person person1 = new Person("John", 30, "Инженер");
        Person person2 = new Person("Mary", 25, "Учитель");
        Person person3 = new Person("Bob", 35, "Врач");
        Person person4 = new Person("Alice", 28, "Архитектор");



        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        person4.displayInfo();



        person4.setProfession("Дизайнер");


        System.out.println("(После обновления профессии)");
        person4.displayInfo();
    }
}
