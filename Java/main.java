package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Car");
        Car car = new Car("MJW321", new Account("Andres Herrera", "AND112"));
        car.passengers = 5;
        car.printDataCar();

        System.out.println("Car");
        Car car2 = new Car("MNZ239", new Account("Ana Maria", "ANA855"));
        car2.passengers = 4;
        car2.printDataCar();

        System.out.println("User");
        User user = new User("David Fernando", "24869954", "prueba@outlook.com", "8954");
        user.PrintDataUser();
    }
}