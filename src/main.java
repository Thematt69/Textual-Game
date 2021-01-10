import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String input = "";
			boolean isUnknown = true;
			Game game = new Game();
			
			System.out.println(">Bienvenue sur Textual Game !\n"
					+ ">Commande \"help\" pour plus d'information.\n"
					+ ">Voulez vous commencez une partie ? (y/n)");
			
			do {
				input = scanner.nextLine();
				if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("o")) {
					isUnknown = false;
				}else if(input.equalsIgnoreCase("n")) {
					System.exit(1);
				}else {
					isUnknown = true;
					System.out.println(">Commande inconnue !");
				}
			} while (isUnknown);
			
			game.start();
			
			scanner.close();
		}
			
	}

}
