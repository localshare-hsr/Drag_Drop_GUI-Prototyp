package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

  private Stage window;
  Button button;


  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("thenewbutton");

    //Form
    TextField nameInput = new TextField();
    nameInput.setPromptText("Enter Text");


    Button button = new Button("Click Me!");
    button.setOnAction(
        e -> {
          isInt(nameInput, nameInput.getText());
          nameInput.clear();
        });


    // Layout
    VBox layout = new VBox(10);
    layout.setPadding(new Insets(20,20,20,20));
    layout.getChildren().addAll(nameInput, button);

    Scene scene = new Scene(layout, 300, 200);
    window.setScene(scene);
    window.show();
  }

  private boolean isInt(TextField input, String message){
    try{
      int age = Integer.parseInt(message);
      System.out.println("User is:" + age);
      return true;
    }
    catch (NumberFormatException e){
      System.out.println("Invalid Input : " + message);
      return false;
    }
  }


  public static void main(String[] args) {
    launch(args);
  }
}
