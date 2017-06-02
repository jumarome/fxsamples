import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene;
    private Button button;
    private TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Las clases principales son TreeView y TreeItem
        this.window = primaryStage;
        window.setTitle("Samples-Topic");

        TreeItem<String> departamentos,contabilidad,ventas,sistemas;
        //Root
        departamentos = new TreeItem<>();
        departamentos.setExpanded(true);

        //Contabilidad
        contabilidad = makeBranch("Contabilidad",departamentos);
        makeBranch("Jhony Pozo",contabilidad);
        makeBranch("Carolina Chavez",contabilidad);
        makeBranch("Javier Sanchez",contabilidad);

        //Ventas
        ventas = makeBranch("Ventas",departamentos);
        makeBranch("Ivvone Aguilar",ventas);
        makeBranch("Miguel Agliar",ventas);
        makeBranch("Andrea Avilez",ventas);

        //Sistemas
        sistemas = makeBranch("Sistemas",departamentos);
        makeBranch("Carlos Espinoza",sistemas);
        makeBranch("Juan Romero",sistemas);
        makeBranch("Erick Espin",sistemas);


        //Create Tree, every tree needs a root
        tree = new TreeView<>(departamentos);
        tree.setShowRoot(false);

        tree.getSelectionModel().selectedItemProperty()
        .addListener((v,oldValue,newValue)->{
            if(newValue!= null)
                System.out.println("Has seleccionado: "+newValue.getValue());
        });


        //Layout
        StackPane layout = new StackPane();
        layout.getChildren().addAll(tree);
        scene = new Scene(layout,400,350);
        window.setScene(scene);
        window.show();
    }

    private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
         TreeItem<String> item = new TreeItem<>(title);
         item.setExpanded(true);
         parent.getChildren().add(item);
         return item;

    }
}
