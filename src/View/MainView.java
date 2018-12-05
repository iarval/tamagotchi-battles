package View;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainView extends Application {

    private GridPane createGridPane() {
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(20));
        gridpane.setHgap(10);
        gridpane.setVgap(10);

        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(50, 150, 300);

        column2.setHgrow(Priority.ALWAYS);
        gridpane.getColumnConstraints().addAll(column1, column2);

        Label fUnameLbl = new Label("Username");
        TextField fUnameFld = new TextField();

        Button saveButton = new Button("Login");
        saveButton.setOnAction(e -> {
            Button button = (Button) e.getTarget();
            button.setText("Please Wait");
        });

        GridPane.setHalignment(fUnameLbl, HPos.CENTER);

        GridPane.setHalignment(fUnameFld, HPos.CENTER);

        GridPane.setHalignment(saveButton, HPos.RIGHT);

        gridpane.add(fUnameLbl, 0, 0);
        gridpane.add(fUnameFld, 1, 0);

        gridpane.add(saveButton, 1, 2);

        return gridpane;

    }

    private FlowPane createTopBanner() {
        FlowPane topBanner = new FlowPane();
        topBanner.setPrefHeight(80);

        Font serif = Font.font("Dialog", 30);

        Text welcomeText = new Text("Please enter Your name");
        welcomeText.setFill(Color.BLACK);
        welcomeText.setFont(serif);

        topBanner.getChildren().addAll(welcomeText);

        return topBanner;
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 450, 200, Color.WHITE);

        GridPane gridpane = createGridPane();
        FlowPane topBanner = createTopBanner();

        root.setTop(topBanner);
        root.setCenter(gridpane);

        primaryStage.setTitle("Gotchi Battles Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
