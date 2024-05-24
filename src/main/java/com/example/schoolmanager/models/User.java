package com.example.schoolmanager.models;

import com.example.schoolmanager.dbconfig.IDBConfig;
import com.example.schoolmanager.interfaces.UserInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String email;

    private String password;

    private Connection connection;

    public User() {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User(int id, String email, String password, Connection connection) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.connection = connection;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
