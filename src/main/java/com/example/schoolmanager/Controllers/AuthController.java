package com.example.schoolmanager.Controllers;

import com.example.schoolmanager.models.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class AuthController {

    @FXML
    private Button Deletestudent;

    @FXML
    private Button create;

    @FXML
    private DatePicker date;

    @FXML
    private TextField email;

    @FXML
    private AnchorPane enrol;

    @FXML
    private TextArea enterfirstname;

    @FXML
    private TextArea enterlastname;

    @FXML
    private TextArea enterplaceofbirth;

    @FXML
    private TextArea enterstate;

    @FXML
    private AnchorPane login_form;

    @FXML
    private Hyperlink login_linkRegister;

    @FXML
    private StackPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private Button signUp;

    @FXML
    void Ajouter(ActionEvent event) throws SQLException {
        String firstName = this.enterfirstname.getText().trim();
        String lastName = this.enterlastname.getText().trim();
        LocalDate dateOfBirth = this.date.getValue();
        String placeOfBirth = this.enterplaceofbirth.getText().trim();
        int state = Integer.parseInt(this.enterstate.getText().trim());


        Student student = new Student();


        student.setFirstname(firstName);
        student.setLastname(lastName);
        student.setDateofbirth(dateOfBirth);
        student.setPlaceofbirth(placeOfBirth);
        student.setState(state);

        try{
            student.setDateofbirth(dateOfBirth);
        }catch (Exception e){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Alert");
            alert.setContentText("Invalide Date");
            alert.showAndWait();
            return;
        }
        student.setPlaceofbirth(String.valueOf(placeOfBirth));
        student.setState(state);

        student.create(student);

       Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("INFO");
        alert.setContentText("User registered successfully");
        alert.showAndWait();
    }
    }

