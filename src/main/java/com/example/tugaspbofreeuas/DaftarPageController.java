package com.example.tugaspbofreeuas;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.sql.*;

public class DaftarPageController {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/penjualan";
    static final String USER = "root";
    static final String PASS = "";
    static Connection conn;
    static ResultSet rs;
    @FXML
    private Button daftar;
    @FXML
    private Button masuk;
    @FXML
    private Pane initialPane = new Pane();
    Stage thisStage;

    @FXML
    protected void registerAction() {
        try{
            thisStage = (Stage)initialPane.getScene().getWindow();
            System.out.println("Hello");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    protected void loginAction() {
        try{
            System.out.println("Hello 2");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}