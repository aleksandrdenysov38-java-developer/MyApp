package lesson11;


class Person {

    private String name;
    private int age;
    private String profession;


    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }


    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }


    public void displayInfo() {

        System.out.println("Имя: " + name + ", Возраст: " + age + ", Профессия: " + profession);

    }
}
