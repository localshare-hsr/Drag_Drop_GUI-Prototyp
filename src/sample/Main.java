package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


import java.awt.*;

public class Main extends Application {

  Stage window;
  Button button;


  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("Windowtitle");


    window.setOnCloseRequest(e -> closeProgamm());
    button = new Button("Close Window");
    button.setOnAction(e -> closeProgamm());

    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    Scene scene = new Scene(layout, 300, 250);
    window.setScene(scene);
    window.show();
  }

  private void closeProgamm(){
    Boolean answer = ConfirmBox.display("Title", "Sure you wanna quit?");
    if(answer){
      window.close();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
