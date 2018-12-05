package View;

import Model.Setup;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene gotchiScene = new Scene(new ChooseGotchiScene(), Setup.DISPLAY_WIDTH, Setup.DISPLAY_HEIGHT);
        primaryStage.setTitle("Tamagotchi Battles Login");
        primaryStage.setScene(gotchiScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
