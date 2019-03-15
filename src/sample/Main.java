package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  private Stage window;
  private ListView<String> listview;

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("checkbox");

    Button button = new Button("Click Me");
    listview = new ListView<>();
    listview.getItems().addAll("Iron Man", "Titanic", "Contact");
    listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    button.setOnAction(e -> buttonClicked());

    // Layout
    VBox layout1 = new VBox(10);
    layout1.setPadding(new Insets(20, 20, 20, 20));
    layout1.getChildren().addAll(listview, button);

    Scene scene = new Scene(layout1, 300, 200);
    window.setScene(scene);
    window.show();
  }

  private void buttonClicked() {
    String message = "";
    ObservableList<String> movies;
    movies = listview.getSelectionModel().getSelectedItems();

    for (String m : movies) {
      message += m + "\n";
    }

    System.out.println(message);
  }

  public static void main(String[] args) {
    launch(args);
  }
}
