import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene;
    private Button button;
    private ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.window = primaryStage;
        window.setTitle("Samples-Topic");
        button = new Button("Submit");
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Volver al futuro",
                "Harry Potter",
                "Spiderman"
        );
        // A diferencia del ChoiceBox el promtText puede tener cualquier string
        comboBox.setPromptText("Cual es tu pelicula favorita?");
        comboBox.setOnAction(e->printMovie());
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(comboBox,button);
        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    private void printMovie() {
        System.out.println("Has seleccionado: "+comboBox.getValue());
    }
}
