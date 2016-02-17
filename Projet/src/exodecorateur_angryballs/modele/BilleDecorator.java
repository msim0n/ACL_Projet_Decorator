package exodecorateur_angryballs.modele;

import java.awt.*;
import java.util.Vector;

import mesmaths.cinematique.Cinematique;
import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Geop;
import mesmaths.geometrie.base.Vecteur;

/**
 * Cas g�n�ral d'une bille de billard
 * 
 *  A MODIFIER
 *  
 * 
 * */
public abstract class BilleDecorator extends Bille
{
//----------------- classe Bille-------------------------------------

	Bille BilleDecore;
/**
 * @param centre
 * @param rayon
 * @param vitesse
 * @param acc�l�ration
 * @param couleur
 */
protected BilleDecorator(Bille B)
{
	BilleDecore = B;
}


/**
 * @return the position
 */
public Vecteur getPosition(){
	return BilleDecore.getPosition();
}



/**
 * @return the rayon
 */
public  double getRayon(){
	return BilleDecore.getRayon();
}



public Color getCouleur(){
	return BilleDecore.getCouleur();
}

/**
 * @return the vitesse
 */
public Vecteur getVitesse(){
	return BilleDecore.getVitesse();
}


/**
 * @return the acc�l�ration
 */
public Vecteur getAcc�l�ration(){
	return BilleDecore.getAcc�l�ration();
}




/**
 * @return the clef
 */
public int getClef(){
	return BilleDecore.getClef();
}

public double masse(){
	return BilleDecore.masse();
}



/**
 * mise � jour de position et vitesse � t+deltaT � partir de position et vitesse � l'instant t
 * 
 * modifie le vecteur position et le vecteur vitesse
 * 
 * laisse le vecteur acc�l�ration intact
 *
 * La bille subit par d�faut un mouvement uniform�ment acc�l�r�
 * */
public  void  d�placer( double deltaT)
{
Cinematique.mouvementUniform�mentAcc�l�r�( this.getPosition(), this.getVitesse(), this.getAcc�l�ration(), deltaT);
}

/**
 * calcul (c-�-d mise � jour) �ventuel  du vecteur acc�l�ration. 
 * billes est la liste de toutes les billes en mouvement
 * Cette m�thode peut avoir besoin de "billes" si this subit l'attraction gravitationnelle des autres billes
 * La nature du calcul du vecteur acc�l�ration de la bille  est d�finie dans les classes d�riv�es
 * A ce niveau le vecteur acc�l�ration est mis � z�ro (c'est � dire pas d'acc�l�ration)
 * */
public  void gestionAcc�l�ration(Vector<Bille> billes)
{
this.getAcc�l�ration().set(Vecteur.VECTEURNUL);
}


/**
 * gestion de l'�ventuelle collision de la bille (this) avec le contour rectangulaire de l'�cran d�fini par (abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur)
 * 
 * d�tecte si il y a collision et le cas �ch�ant met � jour position et vitesse
 * 
 * La nature du comportement de la bille en r�ponse � cette collision est d�finie dans les classes d�riv�es
 * */
public abstract void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur, double hauteur);




//----------------- classe BilleDecorator -------------------------------------
}

