package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Car");
        Car car = new Car("MJW321", new Account("Andres Herrera", "AND112"));
        car.passengers = 5;
        car.printDataCar();

        System.out.println("UberX");
        UberX uberX = new UberX("MNZ239", new Account("Ana Maria", "ANA855"), "Chevrolet", "Spark");
        uberX.passengers = 4;
        uberX.printDataCar();

        System.out.println("User");
        User user = new User("David Fernando", "24869954", "prueba@outlook.com", "8954");
        user.PrintDataUser();
    }
}