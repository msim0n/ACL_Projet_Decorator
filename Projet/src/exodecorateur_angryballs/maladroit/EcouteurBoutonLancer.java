package exodecorateur_angryballs.maladroit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
 *  ICI : IL N'Y A RIEN A CHANGER 
 *  
 *  */
public class EcouteurBoutonLancer extends Observable implements ActionListener
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
this.setChanged();          // indique que l'objet trajectoire a chang�
this.notifyObservers("lancer");    // pr�vient tous les observateurs enregistr�s que this a chang� et envoie (t,f(t))
//this.animationBilles.lancerAnimation();
}

}
