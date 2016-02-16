package exodecorateur_angryballs.modele;

import java.awt.*;
import java.util.Vector;

import mesmaths.cinematique.Cinematique;
import mesmaths.cinematique.Collisions;
import mesmaths.geometrie.base.Geop;
import mesmaths.geometrie.base.Vecteur;

/**
 * Cas général d'une bille de billard
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
 * @param accélération
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
 * @return the accélération
 */
public Vecteur getAccélération(){
	return BilleDecore.getAccélération();
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
 * mise à jour de position et vitesse à t+deltaT à partir de position et vitesse à l'instant t
 * 
 * modifie le vecteur position et le vecteur vitesse
 * 
 * laisse le vecteur accélération intact
 *
 * La bille subit par défaut un mouvement uniformément accéléré
 * */
public  void  déplacer( double deltaT)
{
Cinematique.mouvementUniformémentAccéléré( this.getPosition(), this.getVitesse(), this.getAccélération(), deltaT);
}

/**
 * calcul (c-à-d mise à jour) éventuel  du vecteur accélération. 
 * billes est la liste de toutes les billes en mouvement
 * Cette méthode peut avoir besoin de "billes" si this subit l'attraction gravitationnelle des autres billes
 * La nature du calcul du vecteur accélération de la bille  est définie dans les classes dérivées
 * A ce niveau le vecteur accélération est mis à zéro (c'est à dire pas d'accélération)
 * */
public  void gestionAccélération(Vector<Bille> billes)
{
this.getAccélération().set(Vecteur.VECTEURNUL);
}


/**
 * gestion de l'éventuelle collision de la bille (this) avec le contour rectangulaire de l'écran défini par (abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur)
 * 
 * détecte si il y a collision et le cas échéant met à jour position et vitesse
 * 
 * La nature du comportement de la bille en réponse à cette collision est définie dans les classes dérivées
 * */
public abstract void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur, double hauteur);




//----------------- classe BilleDecorator -------------------------------------
}

