package exodecorateur_angryballs.maladroit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;


/**
 *  ICI : IL N'Y A RIEN A CHANGER 
 *  
 *  */

public class EcouteurBoutonArr�ter extends Observable implements ActionListener 
{

public EcouteurBoutonArr�ter()
{

}

@Override
public void actionPerformed(ActionEvent e)
{
	this.setChanged();          // indique que l'objet trajectoire a chang�
	this.notifyObservers("arreter");    // pr�vient tous les observateurs enregistr�s que this a chang� et envoie (t,f(t))
	//this.animationBilles.lancerAnimation();
}

}
