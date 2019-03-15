package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

  private Stage window;
  Button button;


  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("Windowtitle");

    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10,10,10,10)); //Insets = Padding from the edge
    // cells itself don't have padding
    grid.setVgap(8); // vertical gap between cells
    grid.setHgap(10); //horizontal gap between cells

    // Name Label
    Label nameLabel = new Label("Username");
    GridPane.setConstraints(nameLabel, 0,0);

    //Name Input
    TextField nameInput = new TextField("Default Text");
    GridPane.setConstraints(nameInput, 1, 0);

    // Password Label
    Label passLabel = new Label("Password");
    GridPane.setConstraints(passLabel, 0,1);

    //Password Input
    //Name Input
    TextField passInput = new TextField();
    passInput.setPromptText("Password");
    GridPane.setConstraints(passInput, 1, 1);

    Button loginbutton = new Button("Login");
    loginbutton.setOnAction(e -> System.out.println("Login Processing..."));
    GridPane.setConstraints(loginbutton, 1,2);

    grid.getChildren().addAll(nameLabel,nameInput, passInput, passLabel, loginbutton);

    Scene scene = new Scene(grid, 300, 200);

    window.setScene(scene);
    window.show();
  }



  public static void main(String[] args) {
    launch(args);
  }
}
