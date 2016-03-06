package exodecorateur_angryballs;

import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;
import exodecorateur_angryballs.controleur.AnimationBilles;
import exodecorateur_angryballs.modele.*;
import exodecorateur_angryballs.vues.awt.CadreAngryBalls;

/**
 * Gestion d'une liste de billes en mouvement ayant toutes un comportement différent
 * 
 * Idéal pour mettre en place le DP decorator
 * */
public class TestAngryBalls
{

/**
 * @param args
 */
public static void main(String[] args)
{
//------------------- création de la liste (pour l'instant vide) des billes -----------------------

Vector<Bille> billes = new Vector<Bille>();

//---------------- création de la vue responsable du dessin des billes -------------------------

CadreAngryBalls cadre = new CadreAngryBalls("Angry balls",
                                        "Animation de billes ayant des comportements différents. Situation idéale pour mettre en place le DP Decorator",
                                        billes);

cadre.montrer(); // on rend visible la vue

//------------- remplissage de la liste avec 4 billes -------------------------------



double xMax, yMax;
double vMax = 0.1;
xMax = cadre.largeurBillard();      // abscisse maximal
yMax = cadre.hauteurBillard();      // ordonnée maximale

double rayon = 0.05*Math.min(xMax, yMax); // rayon des billes : ici toutes les billes ont le même rayon, mais ce n'est pas obligatoire

Vecteur p0, p1, p2, p3, p4,  v0, v1, v2, v3, v4;    // les positions des centres des billes et les vecteurs vitesse au démarrage. 
                                                    // Elles vont être choisies aléatoirement

//------------------- création des vecteurs position des billes ---------------------------------

p0 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
p1 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
p2 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
p3 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
p4 = Vecteur.créationAléatoire(0, 0, xMax, yMax);

//------------------- création des vecteurs vitesse des billes ---------------------------------

v0 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);
v1 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, 0);
v2 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);
v3 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);
v4 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);

//--------------- ici commence la partie à changer ---------------------------------
Bille BN1 = new BilleNormale(p0, rayon, v0, "red");
BilleMvtRU BNR1 = new BilleMvtRU(BN1);
BilleMvtRebond B1 = new BilleMvtRebond(BNR1);

Bille BN2 = new BilleNormale(p1, rayon, v1, "yellow");
BilleMvtFrottement BNF2 = new BilleMvtFrottement(BN2);
BilleMvtPesanteur BPF2 = new BilleMvtPesanteur(BNF2,new Vecteur(0,0.001));
BilleMvtRebond B2 = new BilleMvtRebond(BPF2);


Bille BN3 = new BilleNormale(p2, rayon, v2, "green");
BilleMvtNewton BNN3 = new BilleMvtNewton(BN3);
BilleMvtFrottement BNF3 = new BilleMvtFrottement(BNN3);
BilleMvtRebond B3 = new BilleMvtRebond(BNF3);

Bille BN4 = new BilleNormale(p3, rayon, v3, "cyan");
BilleMvtPasseMurailles BNR4 = new BilleMvtPasseMurailles(BN4);
BilleMvtRU B4 = new BilleMvtRU(BNR4);

Bille BN5 = new BilleNormale(p4, rayon, v4, "black");

BilleMvtNewton BNt5 = new BilleMvtNewton(BN5);
BilleMvtArret B5 = new BilleMvtArret(BNt5);

billes.add(B1);
billes.add(B2);
billes.add(B3);
billes.add(B4);
billes.add(B5);

/*billes.add(new         BilleMvtRURebond(p0, rayon, v0, Color.red));
billes.add(new      BilleMvtPesanteurFrottementRebond(p1, rayon, v1, new Vecteur(0,0.001), Color.yellow));
billes.add(new              BilleMvtNewtonFrottementRebond(p2, rayon, v2, Color.green));
billes.add(new              BilleMvtRUPasseMurailles(p3, rayon, v3, Color.cyan));
billes.add(new BilleMvtNewtonArret(p4, rayon, v4,  Color.black));*/

//---------------------- ici finit la partie à changer -------------------------------------------------------------


System.out.println("billes = " + billes);

//-------------------- création de l'objet responsable de l'animation (c'est un thread séparé) -----------------------

AnimationBilles animationBilles = new AnimationBilles(billes, cadre);

}

}
