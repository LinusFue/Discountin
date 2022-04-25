package at.browser.discountin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Start extends Application {
    private Stage stage;
    @Override
    public void start(Stage stage) {
        this.stage = stage;
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 500, 500);

        stage.initStyle(StageStyle.UTILITY);

        stage.setTitle("Discountin");
        stage.setScene(scene);
        stage.show();
    }

    public Stage getStage(){
        return stage;
    }
    public static void main(String[] args) {
        launch();
    }
}