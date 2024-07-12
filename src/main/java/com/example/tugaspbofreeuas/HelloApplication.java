package com.example.tugaspbofreeuas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Selamat Datang Calon Mahasiswa Baru!");
=======
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("daftar-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
>>>>>>> 916c3fcc8946a0815dce16458b21c79f247e2db1
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
