package bin;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuController {
//button "start"  -- >>  Game.start();
    @FXML
    private TextField nameField;

    @FXML
    private Button ExitButton;

    @FXML
    private Button InstructionsButton;

    @FXML
    private Button StartButton;

    public void  ExitButtonPress(){
        Stage stage = (Stage) ExitButton.getScene().getWindow();
        stage.close();
    }

    public void StartBatonPress(){
        Pane gameView = new Pane();
        gameView.setPrefSize(400,300);
    }

}
