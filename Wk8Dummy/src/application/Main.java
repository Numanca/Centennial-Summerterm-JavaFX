package application;
	
import application.CustomPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		BorderPane pane = new BorderPane();
		// Place nodes in the pane
		pane.setTop(new CustomPane("Top"));
		pane.setRight(new CustomPane("Right"));
		pane.setBottom(new CustomPane("Bottom"));
		pane.setLeft(new CustomPane("Left"));
		//pane.setCenter(new CustomPane("Center"));
		
			
	
	// Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("anything...");
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
