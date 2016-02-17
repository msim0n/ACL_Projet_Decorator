package exodecorateur_angryballs.modele;

import java.util.Vector;

import exodecorateur_angryballs.modele.Bille;
import exodecorateur_angryballs.modele.OutilsBille;
import mesmaths.cinematique.Collisions;
import mesmaths.mecanique.MecaniquePoint;

public class BilleMvtNewtonFrottementRebond extends BilleDecorator {

	public BilleMvtNewtonFrottementRebond(Bille B)
	{
	super(B);
	}
	
	/* (non-Javadoc)
	 * @see decorateur_angryballs.modele.Bille#gestionAcc�l�ration(java.util.Vector)
	 */
	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
	super.gestionAcc�l�ration(billes);                              // remise � z�ro du vecteur acc�l�ration
	this.getAcc�l�ration().ajoute(OutilsBille.gestionAcc�l�rationNewton(this, billes));     // contribution de l'acc�l�ration due � l'attraction des autres billes
	this.getAcc�l�ration().ajoute(MecaniquePoint.freinageFrottement(this.masse(), this.getVitesse()));      // contribution de l'acc�l�ration due au frottement dans l'air
	}




	@Override
	public void collisionContour(double abscisseCoinHautGauche,
	        double ordonn�eCoinHautGauche, double largeur, double hauteur)
	{
	Collisions.collisionBilleContourAvecRebond(this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);

	}
}
