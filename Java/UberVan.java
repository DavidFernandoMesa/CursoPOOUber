package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passengers;

    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passengers = passenger;
        } else {
            System.out.println("Numero de pasajeros no validos");
        }
    }
}
