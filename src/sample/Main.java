package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  private Stage window;

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("checkbox");

    // checkbox
    CheckBox box1 = new CheckBox("Bacon");
    CheckBox box2 = new CheckBox("Tuna");
    box2.setSelected(true);

    Button button = new Button("Order now");

    button.setOnAction(e -> handleOptions(box1, box2));
    Button changebutton1 = new Button("ChangeScene");

    Button changebutton2 = new Button("ChangeScnene");

    // Layout
    VBox layout1 = new VBox(10);
    layout1.setPadding(new Insets(20, 20, 20, 20));
    layout1.getChildren().addAll(box1, box2, button, changebutton1);

    VBox layout2 = new VBox(10);
    layout2.setPadding(new Insets(20, 20, 20, 20));
    layout2.getChildren().addAll(changebutton2);

    Scene scene = new Scene(layout1, 300, 200);
    Scene scene2 = new Scene(layout2, 300, 200);
    changebutton1.setOnAction(
        e -> {
          layout2.getChildren().addAll(box1);
          window.setScene(scene2);
        });
    changebutton2.setOnAction(
        e -> {
            layout1.getChildren().addAll(box1, box2, button, changebutton1);
          window.setScene(scene);
        });
    window.setScene(scene);
    window.show();
  }

  private void handleOptions(CheckBox box1, CheckBox box2) {
    String message = "Your Sub contains: ";

    if (box1.isSelected()) {
      message += "Bacon ";
    }
    if (box2.isSelected()) {
      message += "Tuna ";
    }

    System.out.println(message);
  }

  private void setscene1() {}

  public static void main(String[] args) {
    launch(args);
  }
}
