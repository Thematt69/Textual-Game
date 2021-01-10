import java.util.Vector;

enum DifficultéChateau {FACILE,MOYEN,DIFFICILE,EXTREME};

public class Chateau {

	private String nom;
	private String description;
	private int nbrPièce;
	private DifficultéChateau difficulte;
	private Vector<Pièce> pièces;
	
	public Chateau(String nom, String description, int nbrPièce, DifficultéChateau difficulte, Vector<Pièce> pièces) {
		this.nom = nom;
		this.description = description;
		this.nbrPièce = nbrPièce;
		this.difficulte = difficulte;
		this.pièces = pièces;
	}

	@Override
	public String toString() {
		return nom + "\n"
				+ ">" + description + "\n"
				+ ">" + nbrPièce + " pièces - " + difficulte;
	}
	
	public Pièce getPièce(int index) {
		return pièces.elementAt(index);
	}
	
}
