package com.example.schoolmanager.interfaces;

import com.example.schoolmanager.models.Classroom;

import java.util.List;
import java.sql.SQLException;

public interface ClassroomInterface {
    List<Classroom> list() throws SQLException;
}
