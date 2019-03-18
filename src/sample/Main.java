package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  private Stage window;
  private TableView<Product> table;

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("TableView");

    // Name Column
    TableColumn<Product, String> namecolumn = new TableColumn<>("Name");
    namecolumn.setMinWidth(200);
    namecolumn.setCellValueFactory(new PropertyValueFactory<>("Name"));

    // Price Column
    TableColumn<Product, Double> pricecolumn = new TableColumn<>("Price");
    pricecolumn.setMinWidth(200);
    pricecolumn.setCellValueFactory(new PropertyValueFactory<>("Price"));

    // Quantity Column
    TableColumn<Product, Integer> quantitycolumn = new TableColumn<>("Quantity");
    quantitycolumn.setMinWidth(200);
    quantitycolumn.setCellValueFactory(new PropertyValueFactory<>("Quantity"));

    table = new TableView<>();
    table.setItems(getProcuct());
    table.getColumns().addAll(namecolumn, pricecolumn, quantitycolumn);



    VBox vBox = new VBox();
    vBox.getChildren().addAll(table);

    StackPane layout = new StackPane();

    Scene scene = new Scene(vBox);
    window.setScene(scene);
    window.show();
  }

  public ObservableList<Product> getProcuct() {
    ObservableList<Product> products = FXCollections.observableArrayList();
    products.add(new Product("Laptop", 850, 5));
    products.add(new Product("Ball", 0.4, 58));
    products.add(new Product("Toilet", 99, 10));
    products.add(new Product("Cap", 50, 8));
    products.add(new Product("Server", 1000, 45));
  return products;
  }

  public static void main(String[] args) {
    launch(args);
  }
}
