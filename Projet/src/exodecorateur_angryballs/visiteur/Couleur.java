package exodecorateur_angryballs.visiteur;

import java.awt.Color;
import java.lang.reflect.Field;

import exodecorateur_angryballs.modele.Bille;

public class Couleur
{
	
	public static Color convertit(Bille bille)
	{
		Color color;
		try {
		    Field field = Class.forName("java.awt.Color").getField(bille.getCouleur());
		    color = (Color)field.get(null);
		} catch (Exception e) {
		    color = null; // Not defined
		}
		return color;
	}
	
	

}
