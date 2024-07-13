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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public HelloController(Button loginButton) {
        this.loginButton = loginButton;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}