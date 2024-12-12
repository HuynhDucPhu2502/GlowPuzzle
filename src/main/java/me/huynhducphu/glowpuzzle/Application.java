package me.huynhducphu.glowpuzzle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/me/huynhducphu/glowpuzzle/view/MainPanel.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Glow Puzzle");
        stage.setScene(scene);
        stage.getIcons().add(
                new Image(Objects.requireNonNull(getClass().getResource("/me/huynhducphu/glowpuzzle/icon/lightbulb_on.png")).toString())
        );
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
