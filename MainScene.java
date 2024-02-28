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

/**
 * Write a description of class mainScene here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainScene
{
    
    private Control control = new Control();
    private Label showWaterUsage = new Label("0");
    
    public final Scene mainScene(){
        BorderPane mainPane = new BorderPane();
        Group root = new Group();
        
        TextField textField = new TextField();
        textField.setPromptText("Enter amount of water used...");
        Button addWater = new Button("Add water!");
        
        addWater.setOnAction(event -> {
            control.addWater(Integer.parseInt(textField.getText()));
            updateCanvas();
        });
        
        VBox addWaterVBox = new VBox();
        addWaterVBox.getChildren().addAll(textField, addWater);
        mainPane.setBottom(addWaterVBox);
        mainPane.setCenter(showWaterUsage);
        root.getChildren().add(mainPane);
        
        return new Scene(root, 500, 500);
    }
    
    private void updateCanvas(){
        showWaterUsage.setText(String.valueOf(control.getWaterUsed()));
    }
}
