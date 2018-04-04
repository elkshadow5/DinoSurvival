
/********************************************************
 *GUIManager.java
 *Final Project: Dinosaur Survival Simulation 
 *Author: Christian A. Carrizales
 *Date:
 *
 *Variable List: 
 *
 *Methods List: 
 **********************************************************/

//Java import statements

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


@SuppressWarnings("ALL")
public class GUI extends Application {
    
    //Define window properties
    private final int Height = 300;
    private final int Width = 450;
    private final boolean Resizeable = false; //To prevent user from resizing window
    
    //Stage
    @Override
    public void start(Stage primaryStage) {
        
        //Create border pane
        BorderPane showSim = new BorderPane();
        
        //BorderPane design
        Label showYN;
        showYN = new Label("Would you like to see a dinosaur simulation?");
        showYN.setStyle("-fx-font: 20 pt");
        
        Button yesButt, noButt;
        yesButt = new Button("Fuck yeah!");
        yesButt.setStyle("-fx-font: 10 pt");
        yesButt.setMinSize(200, 200);
        
        noButt = new Button("Hell no!");
        noButt.setStyle("-fx-font: 10 pt");
        noButt.setMinSize(200, 200);
        
        HBox centerButts = new HBox();
        centerButts.setAlignment(Pos.CENTER);
        centerButts.setSpacing(15);
        centerButts.getChildren().addAll(yesButt, noButt);
        
        
        //Add to BorderPane
        showSim.setTop(showYN); //Top
        showSim.setAlignment(showYN, Pos.CENTER);
        
        showSim.setCenter(centerButts); //Center
        showSim.setAlignment(centerButts, Pos.TOP_RIGHT);
        
        /***********************Event Handlers**************************/
        //INSERT EVENT HANDLER HERE
        
        
        /***************************************************************/
        
        
        //create scene with all objects in it
        Scene scene = new Scene(showSim, Width, Height, Color.GRAY);
        
        //Set stage properties
        primaryStage.setTitle("Dinosaur Survival Simulator");
        primaryStage.setResizable(Resizeable);
        primaryStage.setScene(scene);
        primaryStage.setHeight(Height);
        primaryStage.setWidth(Width);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}


    
