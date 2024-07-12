package com.example.tugaspbofreeuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
<<<<<<< HEAD
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



=======
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
>>>>>>> 916c3fcc8946a0815dce16458b21c79f247e2db1

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

<<<<<<< HEAD
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






=======
    @FXML //
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    
    @FXML
    private  ImageView imageSekul;
    @FXML
    private Pane initialPage;
    Stage thisStage;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageSekul.setImage(new Image(getClass().getResourceAsStream("sekul.png")));
    }

    public void toMenu() {
        try{
            thisStage = (Stage)initialPage.getScene().getWindow();
            thisStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("nextMenu.fxml"))));
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
>>>>>>> 916c3fcc8946a0815dce16458b21c79f247e2db1
}