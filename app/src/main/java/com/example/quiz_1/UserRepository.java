package com.example.quiz_1;

public class UserRepository {
    public String getUserById(int id) {
        // logic to fetch the username from the database based on the id
        if (id == 1) {
            return "Jubaer";
        }
        else if (id == 2) {
            return "Emon";
        }
        else {
            return "Unknown";
        }
    }
}
