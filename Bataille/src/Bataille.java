import java.util.ArrayList;
import java.util.Collections;

public class Bataille {

	public static void main(String[] args) {
		
		int[] valeurs = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		String[] couleur = {"Carreaux", "Pique", "Trèfle", "Coeur"};
		
		ArrayList<Carte> paquet = new ArrayList<Carte>();
		ArrayList<Carte> jeu1 = new ArrayList<Carte>();
		ArrayList<Carte> jeu2 = new ArrayList<Carte>();
		
		for(int i=0;i<4;i++) {
			for(int j=0; j<13;j++) {
				Carte card = new Carte(valeurs[j], couleur[i]);
				paquet.add(card);
			}

		}
		
		Collections.shuffle(paquet);
		
		for(int i=0;i<paquet.size();i++) {
			if(i<26) {
				jeu1.add(paquet.get(i));
			} else {
				jeu2.add(paquet.get(i));
			}
		}
		
		Joueur joueur1 = new Joueur(0, jeu1);
		Joueur joueur2 = new Joueur(0, jeu2);
		
		while(jeu1.size() > 0 || jeu2.size() > 0 ) {
			
				if(jeu1.get(0).compare(jeu2.get(0).valeur) == 1) {
					joueur1.AddPoint();
					jeu1.add(jeu1.get(0));
					jeu1.remove(0);
					jeu1.add(jeu2.get(0));
					jeu2.remove(0);
				} 
				if (jeu1.get(0).compare(jeu2.get(0).valeur) == 2) {
					joueur2.AddPoint();
					jeu2.add(jeu2.get(0));
					jeu2.remove(0);
					jeu2.add(jeu1.get(0));
					jeu1.remove(0);
				} 
				if(jeu1.get(0).compare(jeu2.get(0).valeur) == 3) {
					jeu1.add(jeu1.get(0));
					jeu2.add(jeu2.get(0));
					jeu1.remove(0);
					jeu2.remove(0);
				}	
				
				System.out.println("gagnant " + jeu1.get(0).compare(jeu2.get(0).valeur));
				System.out.println("joueur1");
				System.out.println(jeu1);
				System.out.println(jeu1.get(0));
				System.out.println("Nombre de cartes " + joueur1.nbCartes());
				System.out.println("Nombre de points " + joueur1.getPoints());
				System.out.println("joueur2");
				System.out.println(jeu2);
				System.out.println(jeu2.get(0));
				System.out.println("Nombre de cartes " + joueur2.nbCartes());
				System.out.println("Nombre de points " + joueur2.getPoints());
				System.out.println(" ");
				
		}
	}

}
