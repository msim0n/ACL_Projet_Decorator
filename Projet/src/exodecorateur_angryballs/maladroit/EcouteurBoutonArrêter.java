package exodecorateur_angryballs.maladroit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;


/**
 *  ICI : IL N'Y A RIEN A CHANGER 
 *  
 *  */

public class EcouteurBoutonArrêter extends Observable implements ActionListener 
{

public EcouteurBoutonArrêter()
{

}

@Override
public void actionPerformed(ActionEvent e)
{
	this.setChanged();          // indique que l'objet trajectoire a changé
	this.notifyObservers("arreter");    // prévient tous les observateurs enregistrés que this a changé et envoie (t,f(t))
	//this.animationBilles.lancerAnimation();
}

}
