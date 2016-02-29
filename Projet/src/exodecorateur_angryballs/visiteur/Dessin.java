package exodecorateur_angryballs.visiteur;

import java.awt.Color;
import java.awt.Graphics;

import exodecorateur_angryballs.modele.Bille;
import exodecorateur_angryballs.modele.VisiteurBille;

public class Dessin implements VisiteurBille
{
	private Graphics graphics;
	
	public Dessin(Graphics graphics) {
		super();
		setGraphics(graphics);
	}

	@Override
	public void visite(Bille bille) {
		// TODO Auto-generated method stub
		int width, height;
		int xMin, yMin;
		
		xMin = (int)Math.round(bille.getPosition().x-bille.getRayon());
		yMin = (int)Math.round(bille.getPosition().y-bille.getRayon());
		
		width = height = 2*(int)Math.round(bille.getRayon()); 
		
		graphics.setColor(Couleur.convertit(bille));//
		graphics.fillOval( xMin, yMin, width, height);
		graphics.setColor(Color.CYAN);
		graphics.drawOval(xMin, yMin, width, height);
	}
	
	public void setGraphics(Graphics graphics) {
		this.graphics = graphics;
	}

}
