package bin.fxController;

import bin.Main;
import bin.gamelogic.Game;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.io.IOException;

public class JoinServerController {

    @FXML
    private Label addressIPLabel;
    @FXML
    private Label portLabel;

    @FXML
    private Button joinButton;
    @FXML
    private Button backButton;

    @FXML
    private TextField addressTextField;
    @FXML
    private TextField portTextField;

    @FXML
    public void initialize() throws IOException {
        setTexts();
    }

    private void setTexts(){
        joinButton.setText(Main.languageProperties.getProperty("join"));
        backButton.setText(Main.languageProperties.getProperty("back"));
        portLabel.setText(Main.languageProperties.getProperty("port"));
        addressIPLabel.setText(Main.languageProperties.getProperty("addressIP"));
    }

    public void joinButtonPress(){
        int port = Integer.parseInt(portTextField.getText());
        String ip = addressTextField.getText();
        new Game(ip ,port);
    }

    public void backButtonPress(){
        Main.window.setScene(MenuController.modeChoiceScene);
    }

    public void joinButtonSetOnMouseEntered(){
        joinButton.setUnderline(true);
    }

    public void joinButtonSetOnMouseExited(){
        joinButton.setUnderline(false);
    }

}
