package ahorcado;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Pintar extends JPanel
{
    private int bandera = 0;
    
    public Pintar()
    {
        setSize(600,300);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.fillRect(0, 250, 300, 50);
        g.fillRect(0, 10, 10, 350);
        g.fillRect(10, 10, 150, 10);
        g.drawLine(150, 10, 150, 50);
        
        if(bandera == 0)
        {
            
        }
        if(bandera == 1)
        {
            //cabeza
            g.drawOval(125, 50, 50, 50);
        }
        else if(bandera == 2)
        {
            //cabeza
            g.drawOval(125, 50, 50, 50);
            //tronco
            g.drawLine(150, 100, 150, 160);
        }
        else if(bandera == 3)
        {
            //cabeza
            g.drawOval(125, 50, 50, 50);
            //tronco
            g.drawLine(150, 100, 150, 160);
            //brazo derecho
            g.drawLine(150, 100, 100, 130);
        }
        else if(bandera == 4)
        {
            //cabeza
            g.drawOval(125, 50, 50, 50);
            //tronco
            g.drawLine(150, 100, 150, 160);
            //brazo derecho
            g.drawLine(150, 100, 100, 130);
            //brazo izq
            g.drawLine(150, 100, 200, 130);
        }
        else if(bandera == 5)
        {
            //cabeza
            g.drawOval(125, 50, 50, 50);
            //tronco
            g.drawLine(150, 100, 150, 160);
            //brazo derecho
            g.drawLine(150, 100, 100, 130);
            //brazo izq
            g.drawLine(150, 100, 200, 130);
            //pierna derecha
            g.drawLine(150, 160, 100, 200);
        }
        else if(bandera == 6)
        {
             //cabeza
            g.drawOval(125, 50, 50, 50);
            //tronco
            g.drawLine(150, 100, 150, 160);
            //brazo derecho
            g.drawLine(150, 100, 100, 130);
            //brazo izq
            g.drawLine(150, 100, 200, 130);
            //pierna derecha
            g.drawLine(150, 160, 100, 200);
            //pierna izq
            g.drawLine(150, 160, 200, 200);
        }
    }
    
    public void error(int error)
    {
        bandera= error;
        this.repaint();
    }
}
