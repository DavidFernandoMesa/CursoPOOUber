package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if (passengers != null ) {
            System.out.println(
                    "The License is: " + license + " your Driver is: " + driver.name + " and number Passengers: "
                            + passengers);
        }
    }

    public Integer getPassenger() {
        return passengers;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passengers = passenger;
        } else {
            System.out.println("Numero de pasajeros no validos");
        }
    }
}
