import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Config config = new Config();
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		boolean isUnknown = true;
		
		Game game = new Game(scanner);
		
		System.out.println(">Bienvenue sur Textual Game !\n"
				+ ">Commande Help pour plus d'information.\n"
				+ ">Voulez vous commencez une partie ? (y/n)");

		Joueur player = new Joueur("", new Sac(null, null, null, null, null, null), 0);
		
		do {
			input = scanner.nextLine();
			if(input.contains("Help") || input.contains("help")) {
				isUnknown = true;
				game.getHelp();
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
				game.getHelp();
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
				game.getHelp();
			}else if(input.equalsIgnoreCase("FACILE")) {
				isUnknown = false;
				game.setChateau(config.chateau1);
			}else if(input.equalsIgnoreCase("MOYEN")) {
				isUnknown = false;
				game.setChateau(config.chateau2);
			}else if(input.equalsIgnoreCase("DIFFICILE")) {
				isUnknown = false;
				game.setChateau(config.chateau3);
			}else if(input.equalsIgnoreCase("EXTREME")) {
				isUnknown = false;
				game.setChateau(config.chateau4);
			}else {
				isUnknown = true;
				System.out.println(">Commande inconnue !");
			}
		} while (isUnknown);
		
		game.start();

		
		scanner.close();
		
		
	}
	

}
