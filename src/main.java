import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Config config = new Config();
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		boolean isUnknown = true;
		
		Chateau chateau = null;
		
		System.out.println(">Bienvenue sur Textual Game !\n"
				+ ">Commande Help pour plus d'information.\n"
				+ ">Voulez vous commencez une partie ? (y/n)");

		Joueur player = new Joueur("", new Sac(null, null, null, null, null, null), 0);
		
		do {
			input = scanner.nextLine();
			if(input.contains("Help") || input.contains("help")) {
				isUnknown = true;
				getHelp();
			}else if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("o")) {
				isUnknown = false;
			}else if(input.equalsIgnoreCase("n")) {
				System.exit(1);
			}else {
				isUnknown = true;
				System.out.println(">Commande inconnue !");
			}
		} while (isUnknown);
		
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
		
		System.out.println(">Bievenue " + input + " !\n"
				+ ">Choissisez une difficulté (FACILE,MOYEN,DIFFICILE,EXTREME)");

		do {
			input = scanner.nextLine();
			if(input.contains("Help") || input.contains("help")) {
				isUnknown = true;
				getHelp();
			}else if(input.equalsIgnoreCase("FACILE")) {
				isUnknown = false;
				chateau = config.chateau1;
			}else if(input.equalsIgnoreCase("MOYEN")) {
				isUnknown = false;
				chateau = config.chateau2;
			}else if(input.equalsIgnoreCase("DIFFICILE")) {
				isUnknown = false;
				chateau = config.chateau3;
			}else if(input.equalsIgnoreCase("EXTREME")) {
				isUnknown = false;
				chateau = config.chateau4;
			}else {
				isUnknown = true;
				System.out.println(">Commande inconnue !");
			}
		} while (isUnknown);
		
		System.out.println(">Bienvenue au " + chateau);
		
		System.out.println(">Vous arriver dans " + chateau.getPièce(0));
		
		System.out.println(">Les pièces adjacentes sont : \n"
				+ ">" + chateau.getPièce(0).getPiècesAdjacentes());
		
		
//		
//		Objet slot1 = new Objet("Epée de la mort",TypeObjet.ARMES,5,10,1);
//		Objet slot2 = new Objet("Gemmes",TypeObjet.GEMME, 0, 0, 25);
//		
//		System.out.println(player1.toString());
//		
//		player1.setXp(20);
//		player1.addObjet(new Objet("Clé du sous-sol",TypeObjet.CLE,0,0,1));
//		player1.addObjet(new Objet("Clé du 1er étage",TypeObjet.CLE,0,0,1));
//		player1.addObjet(new Objet("Couteau",TypeObjet.ARMES,1,2,0));
//		player1.addObjet(new Objet("Jouet pour enfant",TypeObjet.DIVERS,0,1,0));
//		player1.addObjet(new Objet("Gemmes",TypeObjet.GEMME,0,0,20));
//
//		System.out.println(player1.toString());
//		
//		Monstre monster1 = new Monstre("Cochon",10, EtatMonstre.EVEILLE, TypeMonstre.PACIFIQUE);
//		
//		System.out.println(monster1.toString());
		
		
	}
	
	public static void getHelp() {
		System.out.println(">But du jeu : Vous arrivez dans un batiment et devez en ressortir.\n"
				+ ">Pour cela, il vous faudra explorez toutes les pièces et vaincre les différents monstres.\n"
				+ ">Vous pourrez aussi avoir besoin de clé pour passer certaines portes.\n\n"
				+ ">Liste des commmandes :\n"
				+ ">Help : Affiche la liste des commandes\n"
				+ ">Take <objet> : Récupérer un objet");
	}

}
