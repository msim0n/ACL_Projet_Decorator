package exodecorateur_angryballs.controleur.awt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import exodecorateur_angryballs.controleur.EcouteurGenerique;

/**
 *  ICI : IL N'Y A RIEN A CHANGER 
 *  
 *  */
public class EcouteurBoutonLancer extends EcouteurGenerique implements ActionListener
{


/**
 * @param animationsBilles
 */
public EcouteurBoutonLancer()
{
}



@Override
public void actionPerformed(ActionEvent arg0)
{
this.setChanged();          // indique que l'objet trajectoire a changé
this.notifyObservers("lancer");    // prévient tous les observateurs enregistrés que this a changé et envoie (t,f(t))
//this.animationBilles.lancerAnimation();
}

}
