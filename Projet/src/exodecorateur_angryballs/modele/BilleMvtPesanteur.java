package exodecorateur_angryballs.modele;

import java.util.Vector;

import exodecorateur_angryballs.modele.Bille;
import exodecorateur_angryballs.modele.OutilsBille;
import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Vecteur;

public class BilleMvtPesanteur extends BilleDecorator {

	Vecteur pesanteur;
	
	public BilleMvtPesanteur(Bille B,Vecteur P)
	{
	super(B);
	this.pesanteur=P;
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
	this.getAccélération().ajoute(this.pesanteur);          // contribution du champ de pesanteur (par exemple)
	this.BilleDecore.gestionAccélération(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,
	        double ordonnéeCoinHautGauche, double largeur, double hauteur)
	{
	this.BilleDecore.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}

}
