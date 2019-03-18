package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

  private Stage window;
  private TreeView<String> tree;


  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("treeview");

    TreeItem<String> root, bucky ,meghan;

    root = new TreeItem<>();
    root.setExpanded(true);

    //bucky
    bucky = makeBranch("bucky", root);
    makeBranch("test1", bucky);
    makeBranch("test2", bucky);


    //meghan
    meghan = makeBranch("meghan", root);
    makeBranch("test3", meghan);
    makeBranch("test4", meghan);

    //Create Tree
    tree = new TreeView<>(root);

    // IF not False --> node for root is created and not expanded.
    tree.setShowRoot(false);
    tree.getSelectionModel().selectedItemProperty().addListener((v, oldvalue, newvalue) -> {
      if(newvalue != null){
        System.out.println(newvalue.getValue());
      }
    });


    StackPane layout = new StackPane();
    layout.getChildren().add(tree);
    Scene scene = new Scene(layout, 300, 200);
    window.setScene(scene);
    window.show();
  }

  // create Braches
  public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
    TreeItem<String> item = new TreeItem<>(title);
    item.setExpanded(true);
    parent.getChildren().add(item);
    return item;
  }

  public static void main(String[] args) {
    launch(args);
  }
}
