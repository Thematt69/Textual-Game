import java.util.Scanner;
import java.util.Vector;

public class Game {

	private Chateau chateau;
	private Piece piece;
	private Joueur player;
	private Scanner scanner = new Scanner(System.in);
	private boolean isUnknown = true;
	private String input = "";
	private Config config;
	
	public Game() {
		this.config = new Config();
		this.player  = new Joueur("", new Sac(null, null, null, null, null, null), 0,20);
	}
	
	/**
	 * Début de la partie
	 */
	public void start() {
		
		/* Identification du joueur */
		
		System.out.println(">Indiquer le nom de votre personnage : ");

		do {
			input = scanner.nextLine();
			if(input.contains("Help") || input.contains("help")) {
				isUnknown = true;
				getHelp();
			}else if(!input.isEmpty()) {
				isUnknown = false;
				player.setNom(input);
				
			}else {
				isUnknown = true;
				System.out.println(">Commande inconnue !");
			}
		} while (isUnknown);
		
		/* Sélection de la difficulté */
		
		System.out.println(">Choissisez une difficulté (FACILE,MOYEN,DIFFICILE,EXTREME)");

		do {
			input = scanner.nextLine();
			if(input.contains("Help") || input.contains("help")) {
				isUnknown = true;
				getHelp();
			}else if(input.equalsIgnoreCase("FACILE")) {
				isUnknown = false;
				setChateau(config.getChateau1());
			}else if(input.equalsIgnoreCase("MOYEN")) {
				isUnknown = false;
				setChateau(config.getChateau2());
			}else if(input.equalsIgnoreCase("DIFFICILE")) {
				isUnknown = false;
				setChateau(config.getChateau3());
			}else if(input.equalsIgnoreCase("EXTREME")) {
				isUnknown = false;
				setChateau(config.getChateau4());
			}else {
				isUnknown = true;
				System.out.println(">Commande inconnue !");
			}
		} while (isUnknown);
		
		/* Message de bienvenue */
		
		System.out.println(">Bienvenue au " + chateau);
		
		next(chateau.getPiece(0));
	}
	
	/**
	 * Passer une autre pièce
	 * @param nextPiece
	 */
	public void next(Piece nextPiece) {
		setPiece(nextPiece);
		
		if(piece.equals(chateau.getEndPiece())) {
			end();
		}
		else {
			System.out.println(">------------------------\n"
					+ ">Vous arrivez dans " + piece + "\n"
					+ ">Les pièces adjacentes sont : \n"
					+ ">" + piece.getPiecesAdjacentes());
			getRandomObjet();
			getRandomMonstre();
			System.out.println(">Dans qu'elle pièce voulez-vous allez ? (Saisissez la direction)");
			
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
	}
	
	/**
	 * Affiche si un objet a été trouver dans la pièce
	 */
	public void getRandomObjet() {
		if(Math.random() >= 0.25) {
			int rand = (int) (Math.random() * ( (config.objects.size()) - 1 ));
			Objet objet = config.objects.elementAt(rand);
			System.out.println(">Vous avez voyez " + objet + "\n"
					+ ">Voulez-vous le récuperez ? (y/n)");
			
			do {
				input = scanner.nextLine();
				if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("o")) {
					if(player.addObjet(objet)) {	
						isUnknown = false;
						System.out.println(">" + objet + " a été ajouté à votre sac.");
//						config.objects.remove(objet);
					}
				}else if(input.equalsIgnoreCase("n")) {
					isUnknown = false;
				}else {
					isUnknown = true;
					System.out.println(">Commande inconnue !");
				}
			} while (isUnknown);
		}
		
	}
	
	public void getRandomMonstre() {
		if(Math.random() >= 0.65) {
			int rand = (int) (Math.random() * ((config.monstres.size()) - 1));
			Monstre monstre = config.monstres.elementAt(rand);
			switch (monstre.getEtat()) {
			case ATTAQUE:
				System.out.println(">Un " + monstre + " vous attaque !");
				monstre.attack(player,false,scanner);
				break;
			case EVEILLE:
				System.out.println(">Un " + monstre + " est éveillé mais il ne vous attaque pas, profitez-en pour l'attaquer.");
				monstre.attack(player,true,scanner);
				break;
			case ENDORMI:
				System.out.println(">Un " + monstre + " est endormi, il ne faudrait pas le réveiller.");
				break;
			case MORT:
				System.out.println(">Un " + monstre + " est mort dans la pièce.");
				break;

			default:
				break;
			}
		}
	}
	
	/**
	 * Fin de la partie
	 */
	public void end() {
		System.out.println(">------------------------\n"
				+ ">Vous arrivez à la sortie de chateau !\n"
				+ ">------------------------\n"
				+ ">     Félicitation !\n"
				+ ">------------------------");
		System.out.println(">Voulez-vous recommencez ? (y/n)");
		do {
			input = scanner.nextLine();
			if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("o")) {
				isUnknown = false;
			}else if(input.equalsIgnoreCase("n")) {
				isUnknown = false;
				System.exit(1);
			}else {
				isUnknown = true;
				System.out.println(">Commande inconnue !");
			}
		} while (isUnknown);
	}

	/**
	 * Modifier le château en cours
	 * @param chateau
	 */
	public void setChateau(Chateau chateau) {
		this.chateau = chateau;
	}

	/**
	 * Modifier la pièce en cours
	 * @param piece
	 */
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	/**
	 * Passer à une autre pièce, retourne faux si l'accès n'existe pas
	 * @param direction
	 * @return
	 */
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
	
	/**
	 * Renvoie les informations néccesaires pour comprendre le jeu
	 */
	public void getHelp() {
		System.out.println(">But du jeu : Vous arrivez dans un batiment et devez en ressortir.\n"
				+ ">Pour cela, il vous faudra explorez toutes les pieces et vaincre les différents monstres.\n"
				+ ">En explorant les pièces, vous pouvez trouvez des objets, il vous sera demandez si vous voulez le recupérer.");
	}
	
	
}
