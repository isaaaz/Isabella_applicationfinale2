package application; //

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;



public class TravailsStat {
	
	@FXML
	private BarChart<String, Integer> barChart;
	
	@FXML
	private CategoryAxis xAxis;
	
	private ObservableList<String> type =FXCollections.observableArrayList();
	
	@FXML
	private void initialize()
	{
		type.add("Projet");
		type.add("Devoir");
		type.add("Étudier");
		type.add("Autre");
		xAxis.setCategories(type);
	}
	
	
	public void SetStats(List <Tracker> tracker)
	{
		// Compter les étudiants appartenant à la même tranche d'travails
		
		int[] travailsCounter = new int[4]; //tableau pour les nombres des tranches d'âge
		
		for(Tracker e:tracker)
		{
			String travails = e.getTravails();
			Double temps = e.getTemps();

			if(travails.equals("Projets"))
				travailsCounter[0]+= temps;
			else
				if(travails.equals("Devoirs"))
					travailsCounter[1]+= temps;
				else
					if(travails.equals("Étudier"))
						travailsCounter[2]+= temps;
					else
						if(travails.equals("Autre"))
							travailsCounter[3]+= temps;
						
		}
		
		
		XYChart.Series<String,Integer> series = new XYChart.Series<>();
		series.setName("Type de travails"); //légende pour le graphique
		
		// Création du graphique 
		for(int i=0; i<travailsCounter.length; i++)
		{
			series.getData().add(new XYChart.Data<>(type.get(i), travailsCounter[i]));
		}
		barChart.getData().add(series);
		
		
	}
}


