package com.demos.gridpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * @author WowYouCanReallyDance
 */
public class GridPaneApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setMaxSize(300, 200);

        Text scenetext = new Text("Welcome");
        scenetext.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetext, 0, 0, 2, 1);

        Label username = new Label("User Name: ");
        grid.add(username, 0, 1);

        TextField usernameText = new TextField();
        usernameText.setStyle("-fx-min-width: 260px; -fx-min-height: 42px;");
        grid.add(usernameText, 1, 1);

        Label password = new Label("Password: ");
        grid.add(password, 0, 2);

        PasswordField passwordText = new PasswordField();
        passwordText.setStyle("-fx-min-width: 260px; -fx-min-height: 42px;");
        grid.add(passwordText, 1, 2);

        Button btn = new Button("Click To Open Dialog!");
        btn.setStyle("-fx-background-color: rgba(210, 138, 29, 0.6); -fx-min-width: 260px; -fx-min-height: 42px; -fx-border-radius: 16px;");
        btn.setOnAction(actionEvent -> {

        });
        grid.add(btn, 1, 3);

        Button btn1 = new Button("Click To Open WebView!");
        btn1.setStyle("-fx-background-color: rgba(182, 93, 216, 0.6); -fx-min-width: 260px; -fx-min-height: 42px; -fx-border-radius: 16px;");
        btn1.setOnAction(actionEvent -> {
        });
        grid.add(btn1, 1, 4);

        Scene scene = new Scene(grid, 600, 500);

        stage.setTitle("Good Thing!");
        stage.setScene(scene);
        stage.show();
    }
}
