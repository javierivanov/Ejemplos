
import javax.swing.JFrame;

/**
 *
 * @author javier
 */
public class Ventana extends JFrame{
    Panel panel;
    public Ventana()
    {
        super("Titulo");
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //permite terminar la appp cuando la ventana se cierre
        setLocationRelativeTo(null); //Ubica la ventana en el centro de la pantalla
        panel = new Panel();
        add(panel);
        setVisible(true);
    }
}
