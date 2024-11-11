package com.example.quiz_1;

public class UserService {
    private UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public String getFormattedString(int id) {
        String user = userRepo.getUserById(id);
        // "Name: Jubaer"
        return "Name: " + user;
    }
}
