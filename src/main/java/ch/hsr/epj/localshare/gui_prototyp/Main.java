package ch.hsr.epj.localshare.gui_prototyp;


import ch.hsr.epj.localshare.gui_prototyp.Person;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

  private Stage window;
  Button button;

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("Windowtitle");

    Person martin = new Person();

    martin.firstNameProperty().addListener((v, oldValue, newValue) -> {
      System.out.println("Name Changed to: " + newValue);
      System.out.println("firstNameProperty(): " + martin.firstNameProperty());
      System.out.println("getFirstname(): " + martin.getFirstName());
    });


    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10, 10, 10, 10)); // Insets = Padding from the edge
    // cells itself don't have padding
    grid.setVgap(8); // vertical gap between cells
    grid.setHgap(10); // horizontal gap between cells

    //Change firstName
    Button signupbutton = new Button("Sign Up");

    GridPane.setConstraints(signupbutton, 1, 3);

    signupbutton.setOnAction(e -> martin.setFirstName("Märti"));

    grid.getChildren().addAll(signupbutton);

    Scene scene = new Scene(grid, 300, 200);
    window.setScene(scene);
    window.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
