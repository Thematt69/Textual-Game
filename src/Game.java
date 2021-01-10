import java.util.Scanner;

public class Game {

	private Chateau chateau;
	private Piece piece;
	private Scanner scanner;
	private boolean isUnknown = true;
	private String input = "";
	
	public Game(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void start() {
		
		System.out.println(">Bienvenue au " + chateau);
		
		next(chateau.getPiece(0));
	}
	
	public void next(Piece nextPiece) {
		setPiece(nextPiece);
		
		if(piece.equals(chateau.getEndPiece())) {
			end();
		}

		System.out.println(">------------------------\n"
				+ ">Vous arrivez dans " + piece + "\n"
				+ ">Les pièces adjacentes sont : \n"
				+ ">" + piece.getPiecesAdjacentes());
		
		do {
			input = scanner.nextLine();
			if(input.contains("Help") || input.contains("help")) {
				isUnknown = true;
				getHelp();
			}else if(input.equalsIgnoreCase("NORD") && nextDirection("NORD")) {
				isUnknown = false;
			}else if(input.equalsIgnoreCase("SUD") && nextDirection("SUD")) {
				isUnknown = false;
			}else if(input.equalsIgnoreCase("EST") && nextDirection("EST")) {
				isUnknown = false;
			}else if(input.equalsIgnoreCase("OUEST") && nextDirection("OUEST")) {
				isUnknown = false;
			}else {
				isUnknown = true;
				System.out.println(">Direction invalide !");
			}
		} while (isUnknown);
	}
	
	public void end() {
		System.out.println(">------------------------\n"
				+ ">Vous arrivez à la sortie de chateau !\n"
				+ ">--------------\n"
				+ ">Félicitation !\n"
				+ ">--------------");
		System.exit(1);
	}

	public void setChateau(Chateau chateau) {
		this.chateau = chateau;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public boolean nextDirection(String direction) {
		switch (direction) {
		case "NORD":
			if(piece.getNord() != null) {
				next(piece.getNord());
				return true;
			}
			return false;
		case "SUD":
			if(piece.getSud() != null) {
				next(piece.getSud());
				return true;
			}
			return false;
		case "EST":
			if(piece.getEst() != null) {
				next(piece.getEst());
				return true;
			}
			return false;
		case "OUEST":
			if(piece.getOuest() != null) {
				next(piece.getOuest());
				return true;
			}
			return false;

		default:
			return false;
		}
	}
	
	public void getHelp() {
		System.out.println(">But du jeu : Vous arrivez dans un batiment et devez en ressortir.\n"
				+ ">Pour cela, il vous faudra explorez toutes les Pieces et vaincre les différents monstres.\n"
				+ ">Vous pourrez aussi avoir besoin de clé pour passer certaines portes.\n\n"
				+ ">Liste des commmandes :\n"
				+ ">Help : Affiche la liste des commandes\n"
				+ ">Take <objet> : Récupérer un objet");
	}
	
	
}
