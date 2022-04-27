/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql_project;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author Spade
 */
public class StartPorject extends Application{
    public void start(Stage stage){
      Button LaunchLibraryDatabase= new Button("Please click");
      LaunchLibraryDatabase.setTranslateX(265);
      LaunchLibraryDatabase.setTranslateY(100);
      LaunchLibraryDatabase.setOnAction(new EventHandler<ActionEvent>(){

		@Override
		public void handle(ActionEvent e) {
			Login loginlib = new Login();
                        loginlib.setVisible(true);
                        stage.close();				
			
		}
    	  
      });
    //Linear Gradient For Title
      Stop[] stops = new Stop[] {
    		new Stop(0, Color.YELLOW), new Stop(1, Color.RED)
      };
      LinearGradient linearGradient = new LinearGradient(0,0,1,0, true, CycleMethod.NO_CYCLE, stops);
      //Title of Game Selector in Scene
      Text title = new Text();
      title.setText("Click to Launch Our Database");
      title.setFont(Font.font("Verdana",FontWeight.BOLD, 25));
      title.setFill(linearGradient);
      title.setX(100);
      title.setY(85);
    //Instantiating the group class
      Group root = new Group(LaunchLibraryDatabase, title);
      //Instantiating the Scene class
      Scene scene = new Scene(root, 600, 300, Color.PURPLE);
      //Setting the scene to the Stage
      stage.setScene(scene);
      //Setting Title to the stage
      stage.setTitle("This had to be here");
    //Displaying the contents of the stage
      stage.show();
    }
    public static void main(String []args){
        new Login().setVisible(true);
    }
}
