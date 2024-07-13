package com.example.tugaspbofreeuas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("daftar-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMinHeight(200);
        stage.setMinWidth(200);
        stage.setMaxWidth(600);
        stage.setMaxHeight(400);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
