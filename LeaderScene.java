import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class LeaderScene
{
    private ArrayList<Control> users;
    
    public final Scene mainScene(){
        BorderPane mainPane = new BorderPane();
        Group root = new Group();
        
        root.getChildren().add(mainPane);
        return new Scene(root, 500, 500);
    }
}
