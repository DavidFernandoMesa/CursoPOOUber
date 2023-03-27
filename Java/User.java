package Java;

public class User extends Account {
    public User(String name, String document, String email, String password) {
        super(name, document);
        this.email = email;
        this.password = password;
    }

    void PrintDataUser() {
        System.out.println(
                "Name Driver: " + name + " Document is: " + document + " your email is: " + email + " Password"
                        + password);
    }
}
