
public class Joueur {
	
	private String nom;
	private Sac sac;
	private int xp;
	private int pv;
	
	public Joueur(String nom, Sac sac, int xp, int pv) {
		this.nom = nom;
		this.sac = sac;
		this.xp = xp;
		this.pv = pv;
	}

	@Override
	public String toString() {
			return nom + " - " + xp + " xp\n" + sac;
	}
	
	/**
	 * Enleve le nombre de pv indiqué
	 * @param pv
	 */
	public void subPv(int pv) {
		this.pv -= pv;
		if(this.pv <= 0) {
			System.out.println(">------------------------\n"
					+ ">   Vous êtes mort !\n"
					+ ">------------------------");
			System.exit(1);
		}
	}
	
	/**
	 * Renvoi les pv
	 * @return
	 */
	public int getPv() {
		return pv;
	}

	/**
	 * Retourne le nom
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Retourne le sac
	 * @return
	 */
	public Sac getSac() {
		return sac;
	}

	/**
	 * Ajoute un objet dans le sac
	 * @param objet
	 */
	public boolean addObjet(Objet objet) {
		return this.sac.addObjet(objet);
	}

	/**
	 * Renvoie l'expérience
	 * @return
	 */
	public int getXp() {
		return xp;
	}

	/**
	 * Défini l'expérience
	 * @param xp
	 */
	public void setXp(int xp) {
		this.xp = xp;
	}

	/**
	 * Défini le nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	
}
