package ru.severstal.severstalnotesapp.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApp extends Application {

    static Stage authWin;
    Stage layout = new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("loginWindow.fxml"));
        authWin = primaryStage;
        authWin.setScene(new Scene(parent));
        authWin.show();
    }

    public void startLayout() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("layout.fxml"));
        layout.setTitle("Severstal Notes");
        layout.setScene(new Scene(parent));
        layout.show();
    }

    public void loginBut() throws IOException {
        startLayout();
        authWin.close();
    }
}
