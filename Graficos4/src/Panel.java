
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;


/**
 *
 * @author javier
 */
public class Panel extends JPanel implements MouseListener{
    ArrayList<Bala> balitas;
    public Panel(){
        super();
        setSize(640, 480);
        balitas = new ArrayList<>();
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Bala b: balitas){
            b.pintar(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(balitas.size());
        Bala b = new Bala(e.getX(), e.getY(), this);
        balitas.add(b);
        b.start();
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
