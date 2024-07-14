package com.example.tugaspbofreeuas.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
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
    private FXMLLoader fxmlLoader = new FXMLLoader();
    Stage thisStage;

    @FXML
    protected void registerAction() {
        try{
            fxmlLoader.setLocation(getClass().getResource("/com/example/tugaspbofreeuas/hello-view.fxml"));
            thisStage = (Stage)initialPane.getScene().getWindow();
            thisStage.setScene(new Scene(fxmlLoader.load()));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    protected void loginAction() {
        try{
            fxmlLoader.setLocation(getClass().getResource("/com/example/tugaspbofreeuas/login.fxml"));
            thisStage = (Stage)initialPane.getScene().getWindow();
            thisStage.setScene(new Scene(fxmlLoader.load()));
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}