package Java;

public class Driver extends Account {
    public Driver(String name, String document, String email, String password) {
        super(name, document);
    }

    void PrintDataDriver() {
        System.out.println(
                "Your name: " + name + " And document: " + document + " Email: " + email + " Password: " + password);
    }
}
