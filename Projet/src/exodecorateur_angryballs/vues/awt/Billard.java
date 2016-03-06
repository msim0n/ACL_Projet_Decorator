package exodecorateur_angryballs.vues.awt;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Vector;

import exodecorateur_angryballs.modele.Bille;
import exodecorateur_angryballs.modele.VisiteurBille;
import exodecorateur_angryballs.visiteur.Dessin;


/**
 * responsable du dessin des billes
 * 
 *  ICI : IL N'Y A RIEN A CHANGER 
 *  
 * 
 * */
public class Billard extends Canvas
{
Vector<Bille> billes;
VisiteurBille dessine;
    public Billard(Vector<Bille> billes)
    {
    	
    	this.billes = billes;
    }
    /* (non-Javadoc)
     * @see java.awt.Canvas#paint(java.awt.Graphics)
     */
    @Override
    public void paint(Graphics graphics)
    {
    int i;
    dessine = new Dessin(graphics);
    for ( i = 0; i < this.billes.size(); ++i)
        this.billes.get(i).accepte(dessine);
    
    //System.out.println("billes dans le billard = " + billes);
    }

    public void render() {
        BufferStrategy bufferStrategy = this.getBufferStrategy();
        Graphics graphics = bufferStrategy.getDrawGraphics();
    	int i;
    	dessine = new Dessin(graphics);
    	for ( i = 0; i < this.billes.size(); ++i)
            this.billes.get(i).accepte(dessine);
    	if( !bufferStrategy.contentsLost() )
    		bufferStrategy.show();
    	graphics.dispose();
    }
    
 
}
