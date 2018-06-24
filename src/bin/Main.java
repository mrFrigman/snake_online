package bin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Application {

static Stage window;
static Scene menu;
static String name;
static String controller;
static Boolean music;
static Boolean sounds;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        window = primaryStage;
        menu = new Scene(root, 440, 440);
        window.setScene(menu);
        window.getIcons().add(new Image("images/icon.png"));
        window.setX(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2-window.getScene().getWidth()/2);
        window.setY(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2-window.getScene().getHeight()/2);
        window.setTitle("Snake Royale");
        window.setResizable(false);
        window.show();
    }

    private static void getConfiguration() throws IOException{
        fileText config = new fileText("src/config.txt");
        name = config.getMeaning(0);
        controller = config.getMeaning(1);
        music = Boolean.valueOf(config.getMeaning(2));
        sounds = Boolean.valueOf(config.getMeaning(3));
    }

    public static void main(String[] args) throws IOException{
        getConfiguration();
        launch(args);
    }
}
