
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


/**
 *
 * @author javier
 */
public class Ventana extends JFrame {
    Panel p;
    public Ventana()
    {
        super("Ventana");
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p = new Panel();
        add(p);
        addKeyListener(p);
        setVisible(true);
    }


}
