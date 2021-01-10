import java.util.Vector;

enum DifficulteChateau {FACILE,MOYEN,DIFFICILE,EXTREME};

public class Chateau {

	private String nom;
	private String description;
	private int nbrPiece;
	private DifficulteChateau difficulte;
	private Vector<Piece> Pieces;
	
	public Chateau(String nom, String description, int nbrPiece, DifficulteChateau difficulte, Vector<Piece> Pieces) {
		this.nom = nom;
		this.description = description;
		this.nbrPiece = nbrPiece;
		this.difficulte = difficulte;
		this.Pieces = Pieces;
	}

	@Override
	public String toString() {
		return nom + "\n"
				+ ">" + description + "\n"
				+ ">" + nbrPiece + " Pieces - " + difficulte;
	}
	
	public Piece getPiece(int index) {
		return Pieces.elementAt(index);
	}
	
	public Piece getEndPiece() {
		return Pieces.lastElement();
	}
	
}
