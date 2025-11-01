package lesson12;

class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Машина заведена!");
    }


    private void startElectricity() {
        System.out.println("Электросистема запущена");
    }

    private void startCommand() {
        System.out.println("Команда запуска активирована");
    }

    private void startFuelSystem() {
        System.out.println("Топливная система работает");
    }
}
