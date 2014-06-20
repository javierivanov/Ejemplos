
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


/**
 *
 * @author javier
 */
public class Panel extends JPanel implements KeyListener{
    int x,y;
    public Panel()
    {
        setSize(640, 480);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(x, y, 100, 100);
    }
    
        @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            y++;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
