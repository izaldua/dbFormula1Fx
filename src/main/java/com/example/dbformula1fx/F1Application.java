package com.example.dbformula1fx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import java.io.IOException;

public class F1Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
        Properties prop = new Properties();
        try (InputStream input = new
                FileInputStream("C:\\Users\\izmka\\OneDrive\\Escritorio\\Uni\\22-23\\Bigarren Kuatri\\Software Engineering\\labs\\dbFormula1Fx\\config.properties.properties")) {
            prop.load(input);
            System.out.println(prop.getProperty("db.username"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        */
        FXMLLoader fxmlLoader = new FXMLLoader(F1Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("F1 Database");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(); }
}