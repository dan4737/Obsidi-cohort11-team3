package AISLOP;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataManager {
    public List<User> userList = new ArrayList<>();

    // Adds a user and their metadata as a single string
    public void addUser(String firstName, String lastName, String email, String role) {
        userList.add(new User(firstName,lastName,email, role));
    }

    public Optional<User> findByEmail(String email) {
        return userList.stream().filter(u -> u.getEmail().equals(email)).findFirst();
    }

}
