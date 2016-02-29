package exodecorateur_angryballs.maladroit.vues;

import exodecorateur_angryballs.maladroit.EcouteurGenerique;


/**
 * contrat respecté par toute vue capable de dessiner la liste des billes
 * 
 * Comme ça si vous n'aimez pas mes composants awt vous pouvez les changer sans changer le reste de l'appli
 * 
 *  ICI : IL N'Y A RIEN A CHANGER 
 *  
 * 
 * */
public interface VueBillard
{

public double largeurBillard();

public double hauteurBillard();

public void miseAJour();

public void montrer();

public EcouteurGenerique getEcouteurBoutonLancer();

public EcouteurGenerique getEcouteurBoutonArrêter();
}
