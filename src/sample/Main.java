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
      // Layout
    VBox layout1 = new VBox(10);
    layout1.setPadding(new Insets(20, 20, 20, 20));
    layout1.getChildren().addAll(box1, box2, button);

    Scene scene = new Scene(layout1, 300, 200);
    window.setScene(scene);
    window.show();
  }

  private void handleOptions(CheckBox box1, CheckBox box2){
      String message = "Your Sub contains: ";

      if(box1.isSelected()){
          message += "Bacon ";
      }
      if(box2.isSelected()){
          message += "Tuna ";
      }

    System.out.println(message);
  }
  public static void main(String[] args) {
    launch(args);
  }
}
