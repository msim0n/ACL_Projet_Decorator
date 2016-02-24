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
	 * @see decorateur_angryballs.modele.Bille#gestionAccélération(java.util.Vector)
	 */
	@Override
	public void gestionAccélération(Vector<Bille> billes)
	{
	this.BilleDecore.gestionAccélération(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,
	        double ordonnéeCoinHautGauche, double largeur, double hauteur)
	{
		Collisions.collisionBilleContourAvecRebond(this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
		this.BilleDecore.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}

	
}
