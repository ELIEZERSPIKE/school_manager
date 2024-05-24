package com.example.schoolmanager.interfaces;

import com.example.schoolmanager.models.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentInterface {

    void create(Student student) throws SQLException;

    void update(Student student) throws SQLException;

    void delete(int id) throws SQLException;
}
