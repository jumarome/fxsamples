import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
        window.setTitle("Samples-ChoiceBox");
        this.button = new Button("Click me");
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        //getItems returns the ObservableList object which you can add items to
        ObservableList<String> fruits = FXCollections.observableArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("WaterMelon");
        choiceBox.setItems(fruits);
        choiceBox.setValue("Apple");
        button.setOnAction(e->getchoiceBox(choiceBox));
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(button,choiceBox);
        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    private void getchoiceBox(ChoiceBox<String> choiceBox) {
        System.out.println(choiceBox.getValue()+" Selected");
    }
}
