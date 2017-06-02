import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Button button;
    private Scene scene;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.window = primaryStage;
        window.setTitle("Samples-Checkboxes");
        //Checboxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        //Button
        button = new Button("Order Now");
        button.setOnAction(e->handleOptions(box1,box2));

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(box1,box2,button);

        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    //Handle checkbox options
    private void handleOptions(CheckBox box1, CheckBox box2) {
        String message = "Users order\n";
        if(box1.isSelected())
            message+= "Bacon\n";
        if(box2.isSelected())
            message+="Tuna";
        System.out.println(message);
    }
}
