package ch.hsr.epj.guiprototyp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

  private Stage window;
  private BorderPane layout;

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("Create Menus");

    // filemenu
    Menu filemenu = new Menu("File");

    // menuitems ".." einfügen wenn neue Dialoge geöffnet werden.
    MenuItem newFile = new MenuItem("new File");
    newFile.setOnAction(e -> System.out.println("New File"));

    filemenu.getItems().add(newFile);
    filemenu.getItems().add(new MenuItem("Bla.."));
    filemenu.getItems().add(new MenuItem("BlaBla.."));
    filemenu.getItems().add(new MenuItem("Settings.."));
    filemenu.getItems().add(new SeparatorMenuItem());
    filemenu.getItems().add(new MenuItem("Exit"));

    // filemenu mit _ vor Name lässt sich dropdown wia alt + e öffnen
    Menu edit = new Menu("_Edit");
    edit.getItems().add(new MenuItem("UndoTyping"));
    edit.getItems().add(new MenuItem("Copy"));

    // disable Paste
    MenuItem paste = new MenuItem("Paste");
    paste.setDisable(true);
    newFile.setOnAction(e -> System.out.println("New File"));
    edit.getItems().add(paste);


    // Helpmenu mit checkboxen
    Menu help = new Menu("_Help");
    CheckMenuItem line = new CheckMenuItem("Show Line Numbers");
    line.setOnAction(e -> {
            if(line.isSelected()) {
              System.out.println("Programm will list linenumbers");
    }
            else{
              System.out.println("No Linenumbers displayed");
            }
              });

    //Menu Item Default Selected
    CheckMenuItem autosave = new CheckMenuItem("Autosave");
    autosave.setSelected(true);
    help.getItems().addAll(line, autosave);


    // Main Menubar
    MenuBar menubar = new MenuBar();
    menubar.getMenus().addAll(filemenu, edit, help);

    layout = new BorderPane();
    layout.setTop(menubar);

    Scene scene = new Scene(layout, 400, 300);
    window.setScene(scene);
    window.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
