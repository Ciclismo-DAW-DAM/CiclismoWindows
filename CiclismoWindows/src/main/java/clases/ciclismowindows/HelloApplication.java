package clases.ciclismowindows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Stage stage = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/clases/vistas/login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 1280, 720);
        stage.setTitle("Ciclismo");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}