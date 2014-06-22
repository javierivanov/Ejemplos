
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author javier
 */
public class Boton implements MouseListener, MouseMotionListener{
    int x,y;
    Panel p;
    Color color;
    public Boton(int x, int y, Panel p) {
        this.x = x;
        this.y = y;
        this.p = p;
        color = Color.red;
        p.addMouseListener(this);
        p.addMouseMotionListener(this);
    }
    
    public void pintar(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, 100, 50);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getX() >= x && e.getX() <= x + 100 && e.getY() >= y && e.getY() <= y + 50)
        {
            color = Color.BLUE;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        color = Color.red;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getX() >= x && e.getX() <= x + 100 && e.getY() >= y && e.getY() <= y + 50)
        {
            color = Color.black;
        } else {
            color = Color.red;
        }
    }
}
