package com.example.tugaspbofreeuas.controllers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable{

    @FXML
    private ImageView imageSekul;
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
            thisStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("com/example/tugaspbofreeuas/pre"))));
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}