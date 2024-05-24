package com.example.schoolmanager.models;

import com.example.schoolmanager.dbconfig.IDBConfig;
import com.example.schoolmanager.interfaces.StudentInterface;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;


public class Student implements StudentInterface {

    private int id;
    private String firstname;
    private String lastname;
    private LocalDate dateofbirth;
    private String placeofbirth;
    private int state = 0;
    private Connection connection;

    private int classroomId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPlaceofbirth() {
        return placeofbirth;
    }

    public void setPlaceofbirth(String placeofbirth) {
        this.placeofbirth = placeofbirth;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public Student() {
    }

    public void create(Student student) throws SQLException {



        connection = IDBConfig.getConnection();
        if(connection != null){
            String req = "INSERT INTO student(firstname, lastname, dateofbirth, placeofbirth, state ) VALUES (?,?,?,?,?);";


            PreparedStatement prepareStatement = this.connection.prepareStatement(req);

            prepareStatement.setString(1, student.getFirstname());
            prepareStatement.setString(2, student.getLastname());
            prepareStatement.setDate(3, Date.valueOf(getDateofbirth()));
            prepareStatement.setString(4, student.getPlaceofbirth());
            prepareStatement.setInt(5, student.getState());
//
            prepareStatement.execute();

            prepareStatement.close();

            this.connection.close();

        }
    }

    @Override
    public void update(Student student) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }


}



