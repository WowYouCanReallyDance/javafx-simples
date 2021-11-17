package com.demos.fxappone;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        final Scene[] scenes = new Scene[1];
        Button btn0 = new Button();
        btn0.setText("Other Win");
        btn0.setStyle("-fx-background-color: rgba(65, 32, 68, 0.5); -fx-border-radius: 15px; -fx-min-width: 200px; -fx-min-height: 30px;");
        btn0.setOnAction(e -> {
            Button btn = new Button();
            btn.setText("Other Win");
            btn.setStyle("-fx-background-color: rgba(200, 122, 36, 0.8); -fx-border-radius: 25px; -fx-min-width: 200px; -fx-min-height: 50px;");
            btn.setOnAction(e1 -> stage.setScene(scenes[0]));
            BorderPane bpn = new BorderPane(btn);
            Scene scene0 = new Scene(bpn, 600, 500);
            stage.setScene(scene0);
        });

        BorderPane bpn = new BorderPane(btn0);

        scenes[0] = new Scene(bpn, 600, 500);

        stage.setTitle("Test for javafx 17");
        //stage.getIcons().add(new Image("image/logo-monster-pig-001.png"));
        stage.setScene(scenes[0]);
        stage.show();
    }
}
