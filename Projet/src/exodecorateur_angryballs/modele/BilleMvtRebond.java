package exodecorateur_angryballs.modele;

import java.util.Vector;

import exodecorateur_angryballs.modele.Bille;
import exodecorateur_angryballs.modele.OutilsBille;
import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Vecteur;

public class BilleMvtRebond extends BilleDecorator {

	public BilleMvtRebond(Bille B)
	{
	super(B);
	}

	/* (non-Javadoc)
	 * @see decorateur_angryballs.modele.Bille#gestionAcc�l�ration(java.util.Vector)
	 */
	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
	this.BilleDecore.gestionAcc�l�ration(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,
	        double ordonn�eCoinHautGauche, double largeur, double hauteur)
	{
		Collisions.collisionBilleContourAvecRebond(this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
		this.BilleDecore.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}

	
}
