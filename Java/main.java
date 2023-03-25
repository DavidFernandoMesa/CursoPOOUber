package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("MJW321", new Account("Andres Herrera", "AND112"));
        car.passengers = 5;
        car.printDataCar();

        Car car2 = new Car("MNZ239", new Account("Ana Maria", "ANA855"));
        car2.passengers = 4;
        car2.printDataCar();
    }
}