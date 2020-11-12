import java.util.ArrayList;

public class Joueur {

	private ArrayList<Carte> cartes ;
	private int points;
	
	Joueur(int points, ArrayList<Carte> cartes){
		this.cartes = cartes;
		this.points = points;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public String toString() {
		return "Le joueur a " + this.points + " points";
	}
	
	public int nbCartes() {
		return this.cartes.size();
	}
	
	public void AddPoint() {
		this.points = this.points + 1;
	}
	
}
