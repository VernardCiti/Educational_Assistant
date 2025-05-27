package org.amazon.example;

public class User {
    private String firstName;
    private String password;
    private String role;
    public User(String firstName, String password, String role) {
        this.firstName = firstName;
        this.password = password;
        this.role = role;
    }
    public User() {}
}
