import java.util.Vector;

public class Pièce {

	private String nom;
	private double x;
	private double y;
	private Pièce nord;
	private Pièce sud;
	private Pièce est;
	private Pièce ouest;
	
	public Pièce(String nom, double x, double y, Pièce nord, Pièce sud, Pièce est, Pièce ouest) {
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

	public void setPiece(Pièce piece, String direction) {
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
	
	public Vector<Pièce> getPiècesAdjacentes(){
		Vector<Pièce> pièces = new Vector<Pièce>();
		
		if(nord != null) {
			pièces.addElement(nord);
		}
		if(sud != null) {
			pièces.addElement(sud);
		}
		if(est != null) {
			pièces.addElement(est);
		}
		if(ouest != null) {
			pièces.addElement(ouest);
		}
		
		return pièces;
		
	}

	public Pièce getNord() {
		return nord;
	}

	public Pièce getSud() {
		return sud;
	}

	public Pièce getEst() {
		return est;
	}

	public Pièce getOuest() {
		return ouest;
	}
	
}
