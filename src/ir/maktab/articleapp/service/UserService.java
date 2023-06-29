package ir.maktab.articleapp.service;

import ir.maktab.articleapp.model.entity.User;

import java.sql.SQLException;

public interface UserService {
    User signIn(String username, String password) throws SQLException;

    User signUp();

    boolean changePassword();

    boolean checkPassword(); //

    String findUserByID();
}
