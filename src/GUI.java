/********************************************************
 *GUI.java
 *Final Project: Dinosaur Survival Simulation 
 *Author: Christian A. Carrizales
 *Date: 03/19/2018
 **********************************************************/

//Java import statements
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane; 
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.geometry.Insets;


public class GUI extends Application {
	
	//Define window properties
	public int Height = 300 ;
	public int Width = 450 ;
	private boolean Resizeable = false ; //To prevent user from resizing window
	
	//Stage 
	@Override
	public void start (Stage primaryStage) {
	
	/***********************Scene One**************************/
	YesNoPane ynp = new YesNoPane() ; 

	//Create scene with all objects in it
	Scene sceneOne = new Scene(ynp.showSim(), Height, Width, Color.GRAY);
		
		
	/***********************Scene Two**************************/	
		//Pane playGround = new Pane();
		
		//Scene sceneTwo = new Scene(playGround, Color.GRAY);
	/**************************************************************/
				
		//Set stage properties
		primaryStage.setTitle("Dinosaur Survival Simulator");
		primaryStage.setResizable(Resizeable);
		primaryStage.setScene(sceneOne); 
		primaryStage.setHeight(Height);
		primaryStage.setWidth(Width);		
		primaryStage.show();
	      
	}
	
	//Start program (for Eclipse use only)
	public static void main(String[] args) {
		 Application.launch(args);	
	}
 

	
	
	
}


    
