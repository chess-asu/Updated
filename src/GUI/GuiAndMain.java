package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GuiAndMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        MainPane Main = new MainPane();
        Scene scene = new Scene(Main, 1100, 1100);
        primaryStage.setTitle("Chess");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);

    }
}