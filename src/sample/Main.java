package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  private Stage window;

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("checkbox");

    Button button = new Button("Click Me");

    ChoiceBox<String> chbox = new ChoiceBox();

    // get Items
    chbox.getItems().add("Apples");
    chbox.getItems().addAll("Kiwi", "Bacon", "Peach");

    chbox.setValue("Apples");

    button.setOnAction(e -> getChoide(chbox));
    // Layout
    VBox layout1 = new VBox(10);
    layout1.setPadding(new Insets(20, 20, 20, 20));
    layout1.getChildren().addAll(chbox, button);

    Scene scene = new Scene(layout1, 300, 200);
    window.setScene(scene);
    window.show();
  }

  private void getChoide(ChoiceBox<String> box) {
    String food = box.getValue();
    System.out.println(food);
  }

  public static void main(String[] args) {
    launch(args);
  }
}
