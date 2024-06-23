package com.example.bank;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML //
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private ImageView imageBank;
    @FXML
    private ImageView imageTf;
    @FXML
    private ImageView imageDepo;
    @FXML
    private Pane initialPage;
    Stage thisStage;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageBank.setImage(new Image(getClass().getResourceAsStream("bank.jpeg")));
        imageTf.setImage(new Image(getClass().getResourceAsStream("tf.jpg")));
        imageDepo.setImage(new Image(getClass().getResourceAsStream("depo.jpg")));

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
}