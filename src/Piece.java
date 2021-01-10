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

	public Piece getNord() {
		return nord;
	}

	public Piece getSud() {
		return sud;
	}

	public Piece getEst() {
		return est;
	}

	public Piece getOuest() {
		return ouest;
	}
	
}
