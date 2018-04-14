package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        //primaryStage.getIcons().add(new Image("@1.png"));
        primaryStage.setTitle("Halli Mane");
        Scene HomePage = new Scene(root, 700, 500);
        primaryStage.setScene(HomePage);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
