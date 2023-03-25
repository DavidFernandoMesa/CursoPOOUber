package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car();
        car.license = "MJW321";
        car.driver = "Gustavo Meza";
        car.passengers = 5;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "MNZ239";
        car2.driver = "Ana Maria";
        car2.passengers = 4;
        car2.printDataCar();
    }
}