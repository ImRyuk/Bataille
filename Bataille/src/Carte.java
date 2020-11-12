
public class Carte {

	public int valeur;
	private String couleur;
	
	Carte(int valeur, String couleur){
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	public int compare(int value){
		int winner = 0;
		if(this.valeur > value) {
			winner = 1;
		}
		if (this.valeur < value){
			winner = 2;
		}
		if (this.valeur == value){
			winner = 3;
		}
		return winner;
	}
	
	public String toString() {
		return this.valeur + " de " + this.couleur;
	}
	
	
}
