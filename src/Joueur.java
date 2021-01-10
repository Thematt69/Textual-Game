
public class Joueur {
	
	private String nom;
	private Sac sac;
	private int xp;
	
	public Joueur(String nom, Sac sac, int xp) {
		this.nom = nom;
		this.sac = sac;
		this.xp = xp;
	}

	@Override
	public String toString() {
			return nom + " - " + xp + " xp\n" + sac;
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
