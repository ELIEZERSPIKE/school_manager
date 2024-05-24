package com.example.schoolmanager.interfaces;

import com.example.schoolmanager.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserInterface {
    int getId();

    void setId(int id);

    String getEmail();

    void setEmail(String email);

    String getPassword();

    void setPassword(String password);

    List<User> list() throws SQLException;

    void register(User user) throws SQLException;

    boolean onSignIn (User user) throws SQLException;
}
