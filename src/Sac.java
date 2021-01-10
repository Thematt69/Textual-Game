
public class Sac {
	
	private Objet slot1;
	private Objet slot2;
	private Objet slot3;
	private Objet slot4;
	private Objet slot5;
	private Objet slot6;
	
	public Sac(Objet slot1, Objet slot2, Objet slot3, Objet slot4, Objet slot5, Objet slot6) {
		this.slot1 = slot1;
		this.slot2 = slot2;
		this.slot3 = slot3;
		this.slot4 = slot4;
		this.slot5 = slot5;
		this.slot6 = slot6;
	}

	@Override
	public String toString() {
		String message = "";
		if(slot1 != null) {
			message += "Slot 1 : " + slot1;
		}
		if(slot2 != null) {
			message += "\nSlot 2 : " + slot2;
		}
		if(slot3 != null) {
			message += "\nSlot 3 : " + slot3;
		}
		if(slot4 != null) {
			message += "\nSlot 4 : " + slot4;
		}
		if(slot5 != null) {
			message += "\nSlot 5 : " + slot5;
		}
		if(slot6 != null) {
			message += "\nSlot 6 : " + slot6;
		}
		return message;
	}
	
	public void addObjet(Objet objet) {
		if(objet.getType() == TypeObjet.GEMME) {
			if(slot1.getType() == TypeObjet.GEMME) {
				this.slot1.setQuantite(this.slot1.getQuantite()+objet.getQuantite());
			}
			else if(slot2.getType() == TypeObjet.GEMME) {
				this.slot2.setQuantite(this.slot2.getQuantite()+objet.getQuantite());
			}
			else if(slot3.getType() == TypeObjet.GEMME) {
				this.slot3.setQuantite(this.slot3.getQuantite()+objet.getQuantite());
			}
			else if(slot4.getType() == TypeObjet.GEMME) {
				this.slot4.setQuantite(this.slot4.getQuantite()+objet.getQuantite());
			}
			else if(slot5.getType() == TypeObjet.GEMME) {
				this.slot5.setQuantite(this.slot5.getQuantite()+objet.getQuantite());
			}
			else if(slot6.getType() == TypeObjet.GEMME) {
				this.slot6.setQuantite(this.slot6.getQuantite()+objet.getQuantite());
			}
			else {
				System.out.println("Votre sac est plein !\nL'objet suivant n'a pu être ajouté : " + objet);
			}
		}
		else {
			if(slot1 == null) {
				this.slot1=objet;
			}
			else if(slot2 == null) {
				this.slot2=objet;
			}
			else if(slot3 == null) {
				this.slot3=objet;
			}
			else if(slot4 == null) {
				this.slot4=objet;
			}
			else if(slot5 == null) {
				this.slot5=objet;
			}
			else if(slot6 == null) {
				this.slot6=objet;
			}
			else {
				System.out.println("Votre sac est plein !\nL'objet suivant n'a pu être ajouté : " + objet);
			}
		}
			
	}
	

}
