package com.example.tugaspbofreeuas.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private Button tombolKembali;
    @FXML
    private BorderPane thisPane;
    private Stage thisStage;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private TextField emailTextField;

    @FXML
    private PasswordField enterPasswordfield;


    public void LoginButtonOnAction(ActionEvent event){

        if (emailTextField.getText().isBlank() == false && enterPasswordfield.getText().isBlank() == false){

        }
        else{
            loginMessageLabel.setText("Coba masukkan akun yang benar");
        }
    }

    public void kembali(ActionEvent event){

        try{
            thisStage = (Stage)thisPane.getScene().getWindow();
            thisStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/com/example/tugaspbofreeuas/daftar-page.fxml"))));
        }catch(Exception e){

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}