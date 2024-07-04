package com.example.tugaspbofreeuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;




public class HelloController {
    @FXML
    private Label welcomeText;

    public HelloController(Button loginButton) {
        this.loginButton = loginButton;
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button loginButton;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private TextField emailTextField;

    @FXML
    private PasswordField enterPasswordfield;


    public void loginButtonOnAction(ActionEvent event){

        if (emailTextField.getText().isBlank() == false && enterPasswordfield.getText().isBlank() == false){

        }
        else{
            loginMessageLabel.setText("Coba masukkan akun yang benar");
        }
    }






}