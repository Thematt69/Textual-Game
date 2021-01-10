import java.util.Vector;

public class Config {
	public Vector<Objet> objects;
	
	public Config() {
		this.objects = new Vector<Objet>();
		setUpObject();
	}
	
	public void setUpObject(){
		
		/* Armmes */
		objects.add(new Objet("Epée de qualité", TypeObjet.ARMES, 4, 10, 1));
		objects.add(new Objet("Epée de qualité", TypeObjet.ARMES, 4, 10, 1));
		objects.add(new Objet("Epée de qualité", TypeObjet.ARMES, 4, 10, 1));
		
		/* Gemmes */
		objects.add(new Objet("Gemmes", TypeObjet.GEMME, 0, 1, 1));
		objects.add(new Objet("Gemmes", TypeObjet.GEMME, 0, 1, 2));
		objects.add(new Objet("Gemmes", TypeObjet.GEMME, 0, 1, 3));
		objects.add(new Objet("Gemmes", TypeObjet.GEMME, 0, 1, 4));
		objects.add(new Objet("Gemmes", TypeObjet.GEMME, 0, 1, 2));
		objects.add(new Objet("Gemmes", TypeObjet.GEMME, 0, 1, 3));
		objects.add(new Objet("Gemmes", TypeObjet.GEMME, 0, 1, 5));
		objects.add(new Objet("Gemmes", TypeObjet.GEMME, 0, 1, 1));
		
		/* Divers */
		objects.add(new Objet("Rubik's Cube", TypeObjet.DIVERS, 0, 1, 1));
		objects.add(new Objet("Ancienne lettre", TypeObjet.DIVERS, 0, 0, 1));
		objects.add(new Objet("Divers", TypeObjet.DIVERS, 0, 0, 1));
		objects.add(new Objet("Stylo", TypeObjet.DIVERS, 0, 1, 1));
		
		/* Clés */
		//TODO A l'avenir
	}
	
	public Chateau getChateau1() {
		Vector<Piece> PieceChateau1 = new Vector<Piece>();
		
		Piece piece1 = new Piece("Piece 1", 6, 6, null, null, null, null);
		Piece piece2 = new Piece("Piece 2", 6, 6, null, null, null, null);
		Piece piece3 = new Piece("Piece 3", 6, 6, null, null, null, null);
		Piece piece4 = new Piece("Piece 4", 6, 6, null, null, null, null);
		Piece piece5 = new Piece("Piece 5", 6, 6, null, null, null, null);
		Piece piece6 = new Piece("Piece 6", 6, 6, null, null, null, null);
		
		piece1.setPiece(piece2, "Est");
		piece2.setPiece(piece1, "Ouest");
		piece2.setPiece(piece3, "Est");
		piece2.setPiece(piece5, "Sud");
		piece3.setPiece(piece2, "Ouest");
		piece3.setPiece(piece6, "Sud");
		piece4.setPiece(piece5, "Est");
		piece5.setPiece(piece4, "Ouest");
		piece5.setPiece(piece2, "Nord");
		piece6.setPiece(piece3, "Nord");
		
		PieceChateau1.add(piece1);
		PieceChateau1.add(piece2);
		PieceChateau1.add(piece3);
		PieceChateau1.add(piece4);
		PieceChateau1.add(piece5);
		PieceChateau1.add(piece6);
		
		return new Chateau("Forteresse du Périlly","Description",PieceChateau1.size(),DifficulteChateau.FACILE,PieceChateau1);
	}
	
	public Chateau getChateau2() {
		Vector<Piece> PieceChateau2 = new Vector<Piece>();
		
		Piece piece1 = new Piece("Piece 1", 6, 6, null, null, null, null);
		Piece piece2 = new Piece("Piece 2", 6, 6, null, null, null, null);
		Piece piece3 = new Piece("Piece 3", 6, 6, null, null, null, null);
		Piece piece4 = new Piece("Piece 4", 6, 6, null, null, null, null);
		Piece piece5 = new Piece("Piece 5", 6, 6, null, null, null, null);
		Piece piece6 = new Piece("Piece 6", 6, 6, null, null, null, null);
		Piece piece7 = new Piece("Piece 7", 6, 6, null, null, null, null);
		Piece piece8 = new Piece("Piece 8", 6, 6, null, null, null, null);
		Piece piece9 = new Piece("Piece 9", 6, 6, null, null, null, null);
		
		piece1.setPiece(piece4, "Sud");
		piece2.setPiece(piece5, "Sud");
		piece2.setPiece(piece3, "Est");
		piece3.setPiece(piece2, "Ouest");
		piece3.setPiece(piece6, "Sud");
		piece4.setPiece(piece1, "Nord");
		piece4.setPiece(piece5, "Est");
		piece5.setPiece(piece4, "Ouest");
		piece5.setPiece(piece2, "Nord");
		piece5.setPiece(piece6, "Est");
		piece6.setPiece(piece3, "Nord");
		piece6.setPiece(piece5, "Ouest");
		piece6.setPiece(piece9, "Sud");
		piece7.setPiece(piece8, "Est");
		piece8.setPiece(piece7, "Ouest");
		piece8.setPiece(piece9, "Est");
		piece9.setPiece(piece8, "Ouest");
		piece9.setPiece(piece6, "Nord");
		
		PieceChateau2.add(piece1);
		PieceChateau2.add(piece2);
		PieceChateau2.add(piece3);
		PieceChateau2.add(piece4);
		PieceChateau2.add(piece5);
		PieceChateau2.add(piece6);
		PieceChateau2.add(piece7);
		PieceChateau2.add(piece8);
		PieceChateau2.add(piece9);
		
		return new Chateau("Château de Champilly","Description",PieceChateau2.size(),DifficulteChateau.MOYEN,PieceChateau2);
	}
	
	public Chateau getChateau3() {
		Vector<Piece> PieceChateau3 = new Vector<Piece>();
		
		Piece piece1 = new Piece("Piece 1", 6, 6, null, null, null, null);
		Piece piece2 = new Piece("Piece 2", 6, 6, null, null, null, null);
		Piece piece3 = new Piece("Piece 3", 6, 6, null, null, null, null);
		Piece piece4 = new Piece("Piece 4", 6, 6, null, null, null, null);
		Piece piece5 = new Piece("Piece 5", 6, 6, null, null, null, null);
		Piece piece6 = new Piece("Piece 6", 6, 6, null, null, null, null);
		Piece piece7 = new Piece("Piece 7", 6, 6, null, null, null, null);
		Piece piece8 = new Piece("Piece 8", 6, 6, null, null, null, null);
		Piece piece9 = new Piece("Piece 9", 6, 6, null, null, null, null);
		Piece piece10 = new Piece("Piece 10", 6, 6, null, null, null, null);
		Piece piece11 = new Piece("Piece 11", 6, 6, null, null, null, null);
		Piece piece12 = new Piece("Piece 12", 6, 6, null, null, null, null);
		
		piece1.setPiece(piece2, "Est");
		piece2.setPiece(piece1, "Ouest");
		piece2.setPiece(piece6, "Sud");
		piece3.setPiece(piece7, "Sud");
		piece3.setPiece(piece4, "Est");
		piece4.setPiece(piece3, "Ouest");
		piece4.setPiece(piece8, "Sud");
		piece5.setPiece(piece6, "Est");
		piece5.setPiece(piece9, "Sud");
		piece6.setPiece(piece2, "Nord");
		piece6.setPiece(piece5, "Ouest");
		piece6.setPiece(piece7, "Est");
		piece7.setPiece(piece3, "Sud");
		piece7.setPiece(piece6, "Ouest");
		piece7.setPiece(piece8, "Est");
		piece7.setPiece(piece11, "Sud");
		piece7.setPiece(piece6, "Ouest");
		piece7.setPiece(piece8, "Est");
		piece7.setPiece(piece11, "Sud");
		piece8.setPiece(piece4, "Nord");
		piece8.setPiece(piece7, "Ouest");
		piece8.setPiece(piece12, "Sud");
		piece9.setPiece(piece5, "Nord");
		piece9.setPiece(piece10, "Est");
		piece10.setPiece(piece9, "Ouest");
		piece10.setPiece(piece11, "Est");
		piece11.setPiece(piece10, "Ouest");
		piece11.setPiece(piece7, "Nord");
		piece12.setPiece(piece8, "Nord");
		
		PieceChateau3.add(piece1);
		PieceChateau3.add(piece2);
		PieceChateau3.add(piece3);
		PieceChateau3.add(piece4);
		PieceChateau3.add(piece5);
		PieceChateau3.add(piece6);
		PieceChateau3.add(piece7);
		PieceChateau3.add(piece8);
		PieceChateau3.add(piece9);
		PieceChateau3.add(piece10);
		PieceChateau3.add(piece11);
		PieceChateau3.add(piece12);
		
		return new Chateau("Bastion de Goluçon","Description",PieceChateau3.size(),DifficulteChateau.DIFFICILE,PieceChateau3);
	}
	
	public Chateau getChateau4() {
		Vector<Piece> PieceChateau4 = new Vector<Piece>();
		
		Piece piece1 = new Piece("Piece 1", 6, 6, null, null, null, null);
		Piece piece2 = new Piece("Piece 2", 6, 6, null, null, null, null);
		Piece piece3 = new Piece("Piece 3", 6, 6, null, null, null, null);
		Piece piece4 = new Piece("Piece 4", 6, 6, null, null, null, null);
		Piece piece5 = new Piece("Piece 5", 6, 6, null, null, null, null);
		Piece piece6 = new Piece("Piece 6", 6, 6, null, null, null, null);
		Piece piece7 = new Piece("Piece 7", 6, 6, null, null, null, null);
		Piece piece8 = new Piece("Piece 8", 6, 6, null, null, null, null);
		Piece piece9 = new Piece("Piece 9", 6, 6, null, null, null, null);
		Piece piece10 = new Piece("Piece 10", 6, 6, null, null, null, null);
		Piece piece11 = new Piece("Piece 11", 6, 6, null, null, null, null);
		Piece piece12 = new Piece("Piece 12", 6, 6, null, null, null, null);
		Piece piece13 = new Piece("Piece 13", 6, 6, null, null, null, null);
		Piece piece14 = new Piece("Piece 14", 6, 6, null, null, null, null);
		Piece piece15 = new Piece("Piece 15", 6, 6, null, null, null, null);
		Piece piece16 = new Piece("Piece 16", 6, 6, null, null, null, null);
		
		piece1.setPiece(piece2, "Est");
		piece1.setPiece(piece5, "Sud");
		piece2.setPiece(piece1, "Ouest");
		piece3.setPiece(piece7, "Sud");
		piece3.setPiece(piece4, "Est");
		piece4.setPiece(piece3, "Ouest");
		piece4.setPiece(piece8, "Sud");
		piece5.setPiece(piece1, "Nord");
		piece5.setPiece(piece9, "Sud");
		piece6.setPiece(piece7, "Est");
		piece6.setPiece(piece10, "Sud");
		piece7.setPiece(piece3, "Nord");
		piece7.setPiece(piece6, "Ouest");
		piece7.setPiece(piece11, "Sud");
		piece8.setPiece(piece4, "Nord");
		piece8.setPiece(piece12, "Sud");
		piece9.setPiece(piece5, "Nord");
		piece9.setPiece(piece10, "Est");
		piece9.setPiece(piece13, "Sud");
		piece10.setPiece(piece6, "Nord");
		piece10.setPiece(piece9, "Ouest");
		piece11.setPiece(piece7, "Nord");
		piece11.setPiece(piece12, "Est");
		piece11.setPiece(piece15, "Sud");
		piece12.setPiece(piece8, "Nord");
		piece12.setPiece(piece11, "Ouest");
		piece13.setPiece(piece9, "Nord");
		piece13.setPiece(piece14, "Est");
		piece14.setPiece(piece13, "Ouest");
		piece14.setPiece(piece15, "Est");
		piece15.setPiece(piece11, "Nord");
		piece15.setPiece(piece16, "Est");
		piece15.setPiece(piece14, "Ouest");
		piece16.setPiece(piece15, "Ouest");
		
		PieceChateau4.add(piece1);
		PieceChateau4.add(piece2);
		PieceChateau4.add(piece3);
		PieceChateau4.add(piece4);
		PieceChateau4.add(piece5);
		PieceChateau4.add(piece6);
		PieceChateau4.add(piece7);
		PieceChateau4.add(piece8);
		PieceChateau4.add(piece9);
		PieceChateau4.add(piece10);
		PieceChateau4.add(piece11);
		PieceChateau4.add(piece12);
		PieceChateau4.add(piece13);
		PieceChateau4.add(piece14);
		PieceChateau4.add(piece15);
		PieceChateau4.add(piece16);
		
		return new Chateau("Citadelle de la Gosier","Description",PieceChateau4.size(),DifficulteChateau.EXTREME,PieceChateau4);
	}

}
