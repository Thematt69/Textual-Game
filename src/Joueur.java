
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

	public String getNom() {
		return nom;
	}

	public Sac getSac() {
		return sac;
	}

	public void addObjet(Objet objet) {
		this.sac.addObjet(objet);
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
}
