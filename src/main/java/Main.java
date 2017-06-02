import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene;
    private Button button;
    private TableView<Product> table;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.window = primaryStage;
        window.setTitle("Samples-Topic");

        //las tablas necesitan al menos 1 columna

        //Name Column
        TableColumn<Product,String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));

        //Price Column
        TableColumn<Product,Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<Product, Double>("price"));

        //Quantity Column
        TableColumn<Product,Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(50);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));

        table = new TableView<>();
        table.setItems(getProducts());
        table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);
        button = new Button("Click me");
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(table);
        scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    public ObservableList<Product> getProducts(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Asus Rog G752",1299,25));
        products.add(new Product("Macbook Pro",999,45));
        products.add(new Product("Samsung Galaxy A7",399,17));
        products.add(new Product("Amazon Kindle",99,35));
        products.add(new Product("Lenovo Miix 510 ",659,23));
        products.add(new Product("Camiseta Polo",45,38));
        products.add(new Product("Audifonos Beats",199,10));
        products.add(new Product("Whisky JW Blue",199,38));
        products.add(new Product("Chromecast",25,55));
        products.add(new Product("Ipad Pro",629,15));
        return products;
    }
}
