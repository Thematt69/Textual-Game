import java.util.Vector;

public class Config {
	
	public Chateau chateau1;	
	public Chateau chateau2;	
	public Chateau chateau3;	
	public Chateau chateau4;
	public Vector<Objet> objets;
	
	public Config() {
		getChateau1();
		getChateau2();
		getChateau3();
		getChateau4();	
	}
	
	void getChateau1() {
		Vector<Pièce> pièceChateau1 = new Vector<Pièce>();
		
		Pièce piece1 = new Pièce("Pièce 1", 6, 6, null, null, null, null);
		Pièce piece2 = new Pièce("Pièce 2", 6, 6, null, null, null, null);
		Pièce piece3 = new Pièce("Pièce 3", 6, 6, null, null, null, null);
		Pièce piece4 = new Pièce("Pièce 4", 6, 6, null, null, null, null);
		Pièce piece5 = new Pièce("Pièce 5", 6, 6, null, null, null, null);
		Pièce piece6 = new Pièce("Pièce 6", 6, 6, null, null, null, null);
		
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
		
		pièceChateau1.add(piece1);//Haut gauche
		pièceChateau1.add(piece2);//Haut milieu
		pièceChateau1.add(piece3);//Haut droite
		pièceChateau1.add(piece4);//Bas gauche
		pièceChateau1.add(piece5);//Bas milieu
		pièceChateau1.add(piece6);//Bas droite
		
		chateau1 = new Chateau("Forteresse du Périlly","Description",pièceChateau1.size(),DifficultéChateau.FACILE,pièceChateau1);
	}
	
	void getChateau2() {
		Vector<Pièce> pièceChateau2 = new Vector<Pièce>();
		
		Pièce piece1 = new Pièce("Pièce 1", 6, 6, null, null, null, null);
		Pièce piece2 = new Pièce("Pièce 2", 6, 6, null, null, null, null);
		Pièce piece3 = new Pièce("Pièce 3", 6, 6, null, null, null, null);
		Pièce piece4 = new Pièce("Pièce 4", 6, 6, null, null, null, null);
		Pièce piece5 = new Pièce("Pièce 5", 6, 6, null, null, null, null);
		Pièce piece6 = new Pièce("Pièce 6", 6, 6, null, null, null, null);
		Pièce piece7 = new Pièce("Pièce 7", 6, 6, null, null, null, null);
		Pièce piece8 = new Pièce("Pièce 8", 6, 6, null, null, null, null);
		Pièce piece9 = new Pièce("Pièce 9", 6, 6, null, null, null, null);
		
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
		
		pièceChateau2.add(piece1);//Haut gauche
		pièceChateau2.add(piece2);//Haut milieu
		pièceChateau2.add(piece3);//Haut droite
		pièceChateau2.add(piece4);//Milieu gauche
		pièceChateau2.add(piece5);//Milieu milieu
		pièceChateau2.add(piece6);//Milieu droite
		pièceChateau2.add(piece7);//Bas gauche
		pièceChateau2.add(piece8);//Bas milieu
		pièceChateau2.add(piece9);//Bas droite
		
		chateau2 = new Chateau("Château de Champilly","Description",pièceChateau2.size(),DifficultéChateau.MOYEN,pièceChateau2);
	}
	
	void getChateau3() {
		Vector<Pièce> pièceChateau3 = new Vector<Pièce>();
		
		Pièce piece1 = new Pièce("Pièce 1", 6, 6, null, null, null, null);
		Pièce piece2 = new Pièce("Pièce 2", 6, 6, null, null, null, null);
		Pièce piece3 = new Pièce("Pièce 3", 6, 6, null, null, null, null);
		Pièce piece4 = new Pièce("Pièce 4", 6, 6, null, null, null, null);
		Pièce piece5 = new Pièce("Pièce 5", 6, 6, null, null, null, null);
		Pièce piece6 = new Pièce("Pièce 6", 6, 6, null, null, null, null);
		Pièce piece7 = new Pièce("Pièce 7", 6, 6, null, null, null, null);
		Pièce piece8 = new Pièce("Pièce 8", 6, 6, null, null, null, null);
		Pièce piece9 = new Pièce("Pièce 9", 6, 6, null, null, null, null);
		Pièce piece10 = new Pièce("Pièce 10", 6, 6, null, null, null, null);
		Pièce piece11 = new Pièce("Pièce 11", 6, 6, null, null, null, null);
		Pièce piece12 = new Pièce("Pièce 12", 6, 6, null, null, null, null);
		
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
		
		pièceChateau3.add(piece1);//Haut gauche
		pièceChateau3.add(piece2);//Haut milieu gauche
		pièceChateau3.add(piece3);//Haut milieu droite
		pièceChateau3.add(piece4);//Haut droite
		pièceChateau3.add(piece5);//Milieu gauche
		pièceChateau3.add(piece6);//Milieu milieu gauche
		pièceChateau3.add(piece7);//Milieu milieu droite
		pièceChateau3.add(piece8);//Milieu droite
		pièceChateau3.add(piece9);//Bas gauche
		pièceChateau3.add(piece10);//Bas milieu gauche
		pièceChateau3.add(piece11);//Bas milieu droite
		pièceChateau3.add(piece12);//Bas droite
		
		chateau3 = new Chateau("Bastion de Goluçon","Description",pièceChateau3.size(),DifficultéChateau.DIFFICILE,pièceChateau3);
	}
	
	void getChateau4() {
		Vector<Pièce> pièceChateau4 = new Vector<Pièce>();
		
		Pièce piece1 = new Pièce("Pièce 1", 6, 6, null, null, null, null);
		Pièce piece2 = new Pièce("Pièce 2", 6, 6, null, null, null, null);
		Pièce piece3 = new Pièce("Pièce 3", 6, 6, null, null, null, null);
		Pièce piece4 = new Pièce("Pièce 4", 6, 6, null, null, null, null);
		Pièce piece5 = new Pièce("Pièce 5", 6, 6, null, null, null, null);
		Pièce piece6 = new Pièce("Pièce 6", 6, 6, null, null, null, null);
		Pièce piece7 = new Pièce("Pièce 7", 6, 6, null, null, null, null);
		Pièce piece8 = new Pièce("Pièce 8", 6, 6, null, null, null, null);
		Pièce piece9 = new Pièce("Pièce 9", 6, 6, null, null, null, null);
		Pièce piece10 = new Pièce("Pièce 10", 6, 6, null, null, null, null);
		Pièce piece11 = new Pièce("Pièce 11", 6, 6, null, null, null, null);
		Pièce piece12 = new Pièce("Pièce 12", 6, 6, null, null, null, null);
		Pièce piece13 = new Pièce("Pièce 13", 6, 6, null, null, null, null);
		Pièce piece14 = new Pièce("Pièce 14", 6, 6, null, null, null, null);
		Pièce piece15 = new Pièce("Pièce 15", 6, 6, null, null, null, null);
		Pièce piece16 = new Pièce("Pièce 16", 6, 6, null, null, null, null);
		
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
		
		pièceChateau4.add(piece1);
		pièceChateau4.add(piece2);
		pièceChateau4.add(piece3);
		pièceChateau4.add(piece4);
		pièceChateau4.add(piece5);
		pièceChateau4.add(piece6);
		pièceChateau4.add(piece7);
		pièceChateau4.add(piece8);
		pièceChateau4.add(piece9);
		pièceChateau4.add(piece10);
		pièceChateau4.add(piece11);
		pièceChateau4.add(piece12);
		pièceChateau4.add(piece13);
		pièceChateau4.add(piece14);
		pièceChateau4.add(piece15);
		pièceChateau4.add(piece16);
		
		chateau4 = new Chateau("Citadelle de la Gosier","Description",pièceChateau4.size(),DifficultéChateau.EXTREME,pièceChateau4);
	}

}
