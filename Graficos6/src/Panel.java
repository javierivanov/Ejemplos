
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author javier
 */
public class Panel extends JPanel implements MouseListener{

    Motor m;
    LinkedList<Bala> balas;
    Persona persona;
    public Panel(Motor m)
    {
        super();
        setSize(640, 480);
        addMouseListener(this);
        this.m = m;
        this.persona = new Persona(200,200,this);
        balas = new LinkedList<>();
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintarBalas(g);
        persona.pintar(g);
    }
    
    public void pintarBalas(Graphics g)
    {
        Bala b;
        Iterator<Bala> iter = balas.iterator();
        while (iter.hasNext())
        {
            b = iter.next();
            if (b.x >= 640)
            {
                iter.remove();
            }
            else
            {
                b.pintar(g);
            }
        }
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Bala b = new Bala(e.getX(),e.getY(),this);
        b.disparar();
        balas.add(b);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
}
