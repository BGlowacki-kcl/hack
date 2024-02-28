import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoginApp extends Application {
    
    private MainScene mainScene = new MainScene();
    private LeaderScene leaderScene = new LeaderScene();
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        // Create the GridPane layout
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Add labels, text fields, and buttons to the grid
        Label usernameLabel = new Label("Username:");
        grid.add(usernameLabel, 0, 0);
        TextField usernameTextField = new TextField();
        grid.add(usernameTextField, 1, 0);

        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 1);
        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 1);

        Button loginButton = new Button("Login");
        HBox hbLoginButton = new HBox(10);
        hbLoginButton.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        hbLoginButton.getChildren().add(loginButton);
        grid.add(hbLoginButton, 1, 2);

        // Add event handler for the login button
        loginButton.setOnAction(e -> {
            String username = usernameTextField.getText();
            String password = passwordField.getText();
            // Implement your login logic here
            //System.out.println("Username: " + username);
            //System.out.println("Password: " + password);
            if(username.equals("123") && password.equals("123")){
                Scene mainSceneReal = mainScene.mainScene();
                primaryStage.setScene(mainSceneReal);
            } else if(username.equals("leader") && password.equals("123")){
                Scene leaderSceneReal = leaderScene.mainScene();
                primaryStage.setScene(leaderSceneReal);
            } else {
                System.out.println("Wrong username or passsword!");
            }
        });

        // Create the scene and set it on the stage
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
