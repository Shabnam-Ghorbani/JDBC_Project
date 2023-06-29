package ir.maktab.articleapp.service;

import ir.maktab.articleapp.model.entity.User;
import ir.maktab.articleapp.repository.UserRepository;
import ir.maktab.articleapp.validation.Validate;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    UserRepository userRepository = new UserRepository();

    @Override
    public User signIn(String username, String password) throws SQLException {
        if(Validate.isValidPassword(password))
            return userRepository.userSignIn(username,password);
        return null;
    }

    public User signIn(String user)
    {
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
