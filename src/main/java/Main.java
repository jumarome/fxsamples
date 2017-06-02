import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene;
    private Button button;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.window = primaryStage;
        window.setTitle("Samples-Topic");
        button = new Button("Click me");
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(button);
        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
}
