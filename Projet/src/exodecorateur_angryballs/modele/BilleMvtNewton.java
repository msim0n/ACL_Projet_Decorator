package exodecorateur_angryballs.modele;

import java.util.Vector;

import exodecorateur_angryballs.modele.Bille;
import exodecorateur_angryballs.modele.OutilsBille;
import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Vecteur;

public class BilleMvtNewton extends BilleDecorator {

	public BilleMvtNewton(Bille B)
	{
	super(B);
	}

	/* (non-Javadoc)
	 * @see decorateur_angryballs.modele.Bille#gestionAcc�l�ration(java.util.Vector)
	 */
	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes)
	{
	if(!this.isRazAcceleration()){
		super.gestionAcc�l�ration(billes);  // remise � z�ro du vecteur acc�l�ration
		this.setRazAcceleration(true);
		
	}
	this.getAcc�l�ration().ajoute(OutilsBille.gestionAcc�l�rationNewton(this, billes));     // contribution de l'acc�l�ration due � l'attraction des autres billes
	this.BilleDecore.gestionAcc�l�ration(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,
	        double ordonn�eCoinHautGauche, double largeur, double hauteur)
	{
	this.BilleDecore.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}

}
