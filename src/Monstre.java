
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
		return nom + " - " + pv  + " pv (" + etat + ", " + type + ")";
	}
	
	public void subPv(int pv) {
		this.pv -= pv;
	}
	
	public void addPv(int pv) {
		this.pv += pv;
	}
	
}
