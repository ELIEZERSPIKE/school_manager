module com.example.schoolmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.schoolmanager to javafx.fxml;
    exports com.example.schoolmanager;

    opens com.example.schoolmanager.Controllers to javafx.fxml;
    exports com.example.schoolmanager.Controllers;

    opens com.example.schoolmanager.dbconfig to javafx.fxml;
    exports com.example.schoolmanager.dbconfig;

    opens com.example.schoolmanager.interfaces to javafx.fxml;
    exports com.example.schoolmanager.interfaces;

}