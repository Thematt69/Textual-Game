import java.util.Scanner;

enum EtatMonstre{ENDORMI,MORT,EVEILLE,ATTAQUE};
enum TypeMonstre{AGRESSIF,NEUTRE,PACIFIQUE};

public class Monstre {

	private String nom;
	private int pv;
	private EtatMonstre etat;
	private TypeMonstre type;
	
	public Monstre(String nom, int pv, EtatMonstre etat, TypeMonstre type) {
		this.nom = nom;
		this.pv = pv;
		this.etat = etat;
		this.type = type;
	}

	@Override
	public String toString() {
		return nom + " (" + etat + ", " + type + ")";
	}
	
	public void attack(Joueur joueur, boolean isFirst,Scanner scanner) {
		boolean isUnknown = true;
		String input = "";
		Sac sac = joueur.getSac();
		if(sac==null) {
			System.out.println(">Votre sac est vide ! Il n'y a que vos poings.");
			combat(new Objet("Poings", TypeObjet.ARMES, 1, 0, 2),joueur,isFirst);
		}else {
			
			System.out.println(">Quelle objet voulez-vous utilisez ? (Indiquez le chiffre)");

			System.out.println("> 0 - Poings");
			
			for (int i = 1; i < 7; i++) {
				if(sac.getObjet(i) != null) {
					System.out.println("> " + i + " - " + sac.getObjet(i));				
				}
			}
			
			do {
				input = scanner.nextLine();
				Objet objet = null;
				if(Integer.parseInt(input) == 0) {
					objet = new Objet("Poings", TypeObjet.ARMES, 1, 0, 2);
				}else {
					objet =  sac.getObjet(Integer.parseInt(input));
				}
				if(objet != null) {
					combat(objet,joueur,isFirst);
					isUnknown = false;
				}else {
					isUnknown = true;
					System.out.println(">Arme inconnue !");
				}
			} while (isUnknown);
		}
	}
	
	public void combat(Objet objet, Joueur joueur, boolean isFirst) {
		boolean isDead = false;
		do {
			if(isFirst) {
				System.out.println(">Vous tapez le " + this.toString() + ".");
				this.subPv(objet.getDegats());
				System.out.println(">Vous infligez " + objet.getDegats() + " de dégats.");
				if(this.getEtat() == EtatMonstre.MORT) {
					System.out.println(">Le " + this.toString() + " est mort !");
					isDead = true;
				}
			}
			if(!isDead) {
				System.out.println(">Le " + this.toString() + " vous attaque.");
				int rand = (int) (Math.random() * (4 - 1));	
				joueur.subPv(rand);
				System.out.println(">Vous êtes à " + joueur.getPv() + " point de vie.");	
			}
			if(!isFirst) isFirst = true;		
		} while (!isDead);
	}
	
	/**
	 * Renvoie les points de vie
	 * @param pv
	 */
	public void subPv(int pv) {
		this.pv -= pv;
		if(this.pv <=0) {
			this.etat = EtatMonstre.MORT;
		}
	}
	
	/**
	 * Ajouter de points de vie
	 * @param pv
	 */
	public void addPv(int pv) {
		this.pv += pv;
	}

	/**
	 * Change l'état
	 * @param etat
	 */
	public void setEtat(EtatMonstre etat) {
		this.etat = etat;
	}

	/**
	 * Renvoie l'état
	 * @return
	 */
	public EtatMonstre getEtat() {
		return etat;
	}	
	
}
