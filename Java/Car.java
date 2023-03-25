package Java;

public class Car {
    Integer id;
    String license;
    String driver;
    Integer passengers;

    void printDataCar() {
        System.out.println(
                "The License is: " + license + " your Driver is: " + driver + " and number Passengers: " + passengers);
    }
}
