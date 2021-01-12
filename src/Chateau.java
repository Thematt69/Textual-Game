import java.util.Vector;

enum DifficulteChateau {FACILE,MOYEN,DIFFICILE,EXTREME};

public class Chateau {

	private String nom;
	private String description;
	private int nbrPiece;
	private DifficulteChateau difficulte;
	private Vector<Piece> pieces;
	
	public Chateau(String nom, String description, int nbrPiece, DifficulteChateau difficulte, Vector<Piece> pieces) {
		this.nom = nom;
		this.description = description;
		this.nbrPiece = nbrPiece;
		this.difficulte = difficulte;
		this.pieces = pieces;
	}

	@Override
	public String toString() {
		return nom + "\n"
				+ ">" + description + "\n"
				+ ">" + nbrPiece + " pieces - " + difficulte;
	}
	
	/**
	 * Renvoie la pièce correspondant à l'index
	 * @param index
	 * @return
	 */
	public Piece getPiece(int index) {
		return pieces.elementAt(index);
	}
	
	/**
	 * Renvoie la dernière pièce du chateau
	 * @return
	 */
	public Piece getEndPiece() {
		return pieces.lastElement();
	}
}
