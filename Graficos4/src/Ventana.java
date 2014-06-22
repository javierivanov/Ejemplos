
import javax.swing.JFrame;

/**
 *
 * @author javier
 */
public class Ventana extends JFrame{
    Panel p;
    public Ventana()
    {
        super("Ventana");
        setSize(640, 480);
        p = new Panel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(p);
        setVisible(true);
    }
}
