import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene;
    private Button button;
    private ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.window = primaryStage;
        window.setTitle("Samples-Topic");
        button = new Button("Click me");
        listView = new ListView<>();
        listView.getItems().addAll("Futbol","Basket","Tenis","Volley","Box");
        //para poder seleccionar muchos elementos hacemos esto
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        button.setOnAction(e->buttonClicked());
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(button,listView);
        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    private void buttonClicked() {
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();
        movies.forEach(m ->System.out.println(m));
    }
}
