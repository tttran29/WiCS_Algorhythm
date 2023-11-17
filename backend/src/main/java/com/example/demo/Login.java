package com.example.demo;

public class Login {
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private int graduationYear;
    private String password;
    private String hometown;
    private String photoFile;

    public Login() {
    }

    public Login(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public String getPassword() {
        return password;
    }

    public String getHometown() {
        return hometown;
    }

    public String getPhotoFile() {
        return photoFile;
    }
}
