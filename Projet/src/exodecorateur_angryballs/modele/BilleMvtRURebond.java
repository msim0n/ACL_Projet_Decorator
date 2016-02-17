package exodecorateur_angryballs.modele;

import mesmaths.cinematique.Collisions;

public class BilleMvtRURebond extends BilleDecorator{
	
	public BilleMvtRURebond(Bille B)
	{
	super(B);
	}
	
	@Override
	public void collisionContour(double abscisseCoinHautGauche,
	        double ordonn�eCoinHautGauche, double largeur, double hauteur)
	{
	Collisions.collisionBilleContourAvecRebond( this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);

	}

}
