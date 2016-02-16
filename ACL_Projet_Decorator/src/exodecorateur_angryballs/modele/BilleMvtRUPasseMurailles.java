package exodecorateur_angryballs.modele;

import mesmaths.cinematique.Collisions;

public class BilleMvtRUPasseMurailles extends BilleDecorator {
	
	public BilleMvtRUPasseMurailles(Bille B)
	{
	super(B);
	}
	
	public void collisionContour(double abscisseCoinHautGauche,
	        double ordonnéeCoinHautGauche, double largeur, double hauteur)
	{
	Collisions.collisionBilleContourPasseMuraille( this.getPosition(), abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);

	}

}
