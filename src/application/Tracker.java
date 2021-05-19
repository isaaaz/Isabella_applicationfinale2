package application;

public class Tracker {

	private String sujet;
	private String travails;
	private Double temps;
	private String note;
	
	
	
	public Tracker()
	{
		this(null,null);
	}


	// Constructeur avec 2 paramètres
	
	public Tracker(String sujet, String note)
	{
		this.sujet=sujet;
		this.travails="";
		this.temps=0.0;
		this.note=note;
	}
	

	// Getters et Setters 
	
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getTravails() {
		return travails;
	}
	public void setTravails(String travails) {
		this.travails = travails;
	}
	public Double getTemps() {
		return temps;
	}
	public void setTemps(Double temps) {
		this.temps = temps;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

}

	