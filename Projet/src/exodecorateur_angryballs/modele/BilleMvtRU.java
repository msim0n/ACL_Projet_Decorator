package exodecorateur_angryballs.modele;

import java.awt.Color;
import java.util.Vector;

import exodecorateur_angryballs.modele.Bille;
import exodecorateur_angryballs.modele.OutilsBille;
import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Vecteur;

public class BilleMvtRU extends BilleDecorator {

	public BilleMvtRU(Bille B)
	{
	super(B);
	}

	/* (non-Javadoc)
	 * @see decorateur_angryballs.modele.Bille#gestionAccélération(java.util.Vector)
	 */
	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
	if(!this.isRazAcceleration()){
		super.gestionAccélération(billes);  // remise à zéro du vecteur accélération
		this.setRazAcceleration(true);
		
	}
	this.BilleDecore.gestionAccélération(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,
	        double ordonnéeCoinHautGauche, double largeur, double hauteur)
	{
	this.BilleDecore.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}

}
