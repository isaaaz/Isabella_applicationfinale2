/*
* Author: Isabella Zhang 
* Date: 07-Mai-2021
* Le nom du programme: Gestionnaire de travails
* Description: un programme qui permet à l'utilisateur de gérer son temps pour ses travaux 
* scolaires et qui peut sauvegarder des données et générer des graphiques.
*/

package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Tracker.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("bootstrap3.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Gestionnaire de travails");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}
	
	public static void main(String[] args) {
		launch(args); 
	}
}
//