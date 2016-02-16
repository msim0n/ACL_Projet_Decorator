package exodecorateur_angryballs.modele;

import mesmaths.cinematique.Collisions;

public class BilleMvtRUPasseMurailles extends BilleDecorator {
	
	public BilleMvtRUPasseMurailles(Bille B)
	{
	super(B);
	}
	
	public void collisionContour(double abscisseCoinHautGauche,
	        double ordonn�eCoinHautGauche, double largeur, double hauteur)
	{
	Collisions.collisionBilleContourPasseMuraille( this.getPosition(), abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);

	}

}
