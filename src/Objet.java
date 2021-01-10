enum TypeObjet {ARMES,CLE,GEMME,DIVERS};

public class Objet {
	
	private String nom;
	private TypeObjet type;
	private int degats; // Dégats subis par l'adversaire
	private int prix; // Prix en nombre de gemme
	private int quantite;
	
	public Objet(String nom, TypeObjet type, int degats, int prix, int quantite) {
		this.nom = nom;
		this.type = type;
		this.degats = degats;
		this.prix = prix;
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		switch (type) {
			case ARMES: {
				return nom + " (" + degats + " dégats, " + prix + " gemmes)";	
			}
			case CLE: {
				return nom;
			}
			case GEMME: {
				if(quantite>1) {
					return quantite + " gemmes";
				}else {
					return quantite + " gemme";
				}
			}
			case DIVERS:{
				return nom + " (" + prix + " gemmes)";
			}
		default:
			return "Objet [nom=" + nom + ", type=" + type + ", degats=" + degats + ", prix=" + prix + ", quantite=" + quantite + "]";
		}
	}

	public TypeObjet getType() {
		return type;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	
}
