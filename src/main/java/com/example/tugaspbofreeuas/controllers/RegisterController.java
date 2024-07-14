package com.example.tugaspbofreeuas.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController{

    @FXML
    private Pane registrationPage;
    @FXML
    private Button tombolKembali;
    private Stage thisStage;

    @FXML
    public void next(){
        try{

        }catch(Exception e){
            System.out.println(e);
        }
    }

    @FXML
    public void kembali(){
        try{
            thisStage = (Stage)registrationPage.getScene().getWindow();
            thisStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/com/example/tugaspbofreeuas/daftar-page.fxml"))));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
