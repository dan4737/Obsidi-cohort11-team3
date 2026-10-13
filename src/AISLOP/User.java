package AISLOP;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String role;

    public User(String firstname, String lastname, String email, String role) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = email;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}
