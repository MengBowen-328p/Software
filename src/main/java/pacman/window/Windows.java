package pacman.window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 * Hello world!
 *
 */
public class Windows extends Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 1024, 768);
        primaryStage.getIcons().add(new Image("file:src/sprite/key.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

