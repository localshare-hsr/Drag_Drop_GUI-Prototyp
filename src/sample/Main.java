package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  private Stage window;
  private ComboBox<String> coBox;

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("checkbox");

    Button button = new Button("Click Me");

    coBox = new ComboBox<String>();

    coBox.setEditable(true);

    // get Items
    coBox.getItems().addAll("Die Hard", "Star Wars", "Batman");

    coBox.setPromptText("What is your favorite movie?");
    button.setOnAction(e -> printMovie());

    coBox.setOnAction(e -> System.out.println("User Selected: " + coBox.getValue()));
    // Layout
    VBox layout1 = new VBox(10);
    layout1.setPadding(new Insets(20, 20, 20, 20));
    layout1.getChildren().addAll(coBox, button);

    Scene scene = new Scene(layout1, 300, 200);
    window.setScene(scene);
    window.show();
  }

  private void printMovie(){
    System.out.println(coBox.getValue());
  }

  public static void main(String[] args) {
    launch(args);
  }
}
