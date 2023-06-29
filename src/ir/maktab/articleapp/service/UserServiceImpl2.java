package ir.maktab.articleapp.service;

import ir.maktab.articleapp.model.entity.User;

import java.sql.SQLException;

public class UserServiceImpl2 implements UserService{
    @Override
    public User signIn(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public User signUp() {
        return null;
    }

    @Override
    public boolean changePassword() {
        return false;
    }

    @Override
    public boolean checkPassword() {
        return false;
    }

    @Override
    public String findUserByID() {
        return null;
    }
}
