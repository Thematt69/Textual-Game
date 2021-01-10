import java.util.Vector;

public class Piece {

	private String nom;
	private double x;
	private double y;
	private Piece nord;
	private Piece sud;
	private Piece est;
	private Piece ouest;
	
	public Piece(String nom, double x, double y, Piece nord, Piece sud, Piece est, Piece ouest) {
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.nord = nord;
		this.sud = sud;
		this.est = est;
		this.ouest = ouest;
	}

	@Override
	public String toString() {
		String message = nom + " (" + x + "m x " + y + "m)";
		return message;
	}

	/**
	 * Défini la pièce adjacente
	 * @param piece
	 * @param direction
	 */
	public void setPiece(Piece piece, String direction) {
		switch (direction) {
			case "Nord":
				this.nord = piece;
				break;
			case "Sud":
				this.sud = piece;
				break;
			case "Est":
				this.est = piece;
				break;
			case "Ouest":
				this.ouest = piece;
				break;
		
			default:
				break;
		}
	}
	
	/**
	 * Renvoie toutes les pièces adjacentes
	 * @return
	 */
	public Vector<String> getPiecesAdjacentes(){
		Vector<String> Pieces = new Vector<String>();
		
		if(nord != null) {
			Pieces.addElement("Nord : " + nord);
		}
		if(sud != null) {
			Pieces.addElement("Sud : " + sud);
		}
		if(est != null) {
			Pieces.addElement("Est : " + est);
		}
		if(ouest != null) {
			Pieces.addElement("Ouest : " + ouest);
		}
		
		return Pieces;
		
	}

	/**
	 * Envoie la pièce au Nord
	 * @return
	 */
	public Piece getNord() {
		return nord;
	}

	/**
	 * Envoie la pièce au Sud
	 * @return
	 */
	public Piece getSud() {
		return sud;
	}

	/**
	 * Envoie la pièce à l'Est
	 * @return
	 */
	public Piece getEst() {
		return est;
	}

	/**
	 * Envoie la pièce à l'Ouest
	 * @return
	 */
	public Piece getOuest() {
		return ouest;
	}
	
}
