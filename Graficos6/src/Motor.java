
import javax.swing.JFrame;

/**
 *
 * @author javier
 */
public class Motor {
    
    private boolean iniciado;
    Panel p;
    public Motor()
    {
        p = new Panel(this);
        JFrame v = new JFrame("Ventana");
        v.setSize(640, 480);
        v.add(p);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    
    public void stop()
    {
        this.iniciado = false;
    }
    
    public void start()
    {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                iniciado = true;
                while (iniciado)
                {
                    p.repaint();
                    try {
                        Thread.sleep(20);
                    } catch(Exception e){}
                }
            }
        });
        t.start();
    }
    
}
