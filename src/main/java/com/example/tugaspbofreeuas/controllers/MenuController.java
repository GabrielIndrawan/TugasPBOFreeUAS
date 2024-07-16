package com.example.tugaspbofreeuas.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable{

    public MenuController(String storedValue, String storedEmail){
        this.storedValue = storedValue;
        this.storedEmail = storedEmail;
    }

    private String storedEmail;
    private String storedValue;
    @FXML
    private Label welcomeText = new Label();
    @FXML
    private ImageView logIconHolder;
    @FXML
    private ImageView editIconHolder;
    @FXML
    private Button tombolkembali;
    @FXML
    private ImageView informationIconHolder;
    @FXML
    private Pane initialPage;
    private Stage thisStage;

    public String getStoredValue(){
        return storedValue;
    }

    public String getStoredEmail(){
        return storedEmail;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            logIconHolder.setImage(new Image(getClass().getResourceAsStream("/com/example/tugaspbofreeuas/download.png")));
            editIconHolder.setImage(new Image(getClass().getResourceAsStream("/com/example/tugaspbofreeuas/edit-icon.png")));
            informationIconHolder.setImage(new Image(getClass().getResourceAsStream("/com/example/tugaspbofreeuas/information-icon.png")));
            welcomeText.setText("Selamat datang, "+storedValue+"...");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    public void logButtonAction(ActionEvent event) {
        try{
            thisStage = (Stage)initialPage.getScene().getWindow();
            thisStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/com/example/tugaspbofreeuas/log-page.fxml"))));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    public void editButtonAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/tugaspbofreeuas/register.fxml"));
            thisStage = (Stage)initialPage.getScene().getWindow();
            fxmlLoader.setController(new EditController(storedEmail));
            thisStage.setScene(new Scene(fxmlLoader.load()));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    public void toMenu() {
        try{
            thisStage = (Stage)initialPage.getScene().getWindow();
            thisStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("com/example/tugaspbofreeuas/daftar-page.fxml"))));
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @FXML
    public void informationButtonAction(ActionEvent event) {
        try{
            thisStage = (Stage)initialPage.getScene().getWindow();
            thisStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/com/example/tugaspbofreeuas/information-page.fxml"))));
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
