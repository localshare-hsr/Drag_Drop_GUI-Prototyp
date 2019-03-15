package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


import java.awt.*;

public class Main extends Application {

  private Stage window;
  Button button;


  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("Windowtitle");

    HBox topMenu = new HBox();
    Button buttonA = new Button("File");
    Button buttonB = new Button("Edit");
    Button buttonC = new Button("New");

    topMenu.getChildren().addAll(buttonA,  buttonB, buttonC);

    VBox leftMenu = new VBox();
    Button buttonD = new Button("D");
    Button buttonE = new Button("E");
    Button buttonF = new Button("F");
    leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

    BorderPane borderPane = new BorderPane();
    borderPane.setTop(topMenu);
    borderPane.setLeft(leftMenu);


    Scene scene = new Scene(borderPane, 300, 250);
    window.setScene(scene);
    window.show();
  }



  public static void main(String[] args) {
    launch(args);
  }
}
