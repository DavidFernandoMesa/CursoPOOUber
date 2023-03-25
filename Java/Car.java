package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println(
                "The License is: " + license + " your Driver is: " + driver.name + " and number Passengers: " + passengers);
    }
}
