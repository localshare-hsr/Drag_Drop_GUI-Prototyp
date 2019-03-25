package ch.hsr.epj.localshare.gui_prototyp;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Login Info with Binding");

        //Input and Labels
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);

        Label fistlabel = new Label("Welcome to the site");
        Label secondlabel = new Label();

        HBox bottomtext = new HBox(fistlabel, secondlabel);
        bottomtext.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(10, userInput, bottomtext);
        vbox.setAlignment(Pos.CENTER);

        secondlabel.textProperty().bind(userInput.textProperty());

        Scene scene = new Scene(vbox, 300, 200);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
