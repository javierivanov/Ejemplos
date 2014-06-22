
import javax.swing.JFrame;

/**
 *
 * @author javier
 */
public class Motor extends Thread{
    Panel p;
    public Motor(){
        JFrame v = new JFrame("Ventana");
        p = new Panel();
        v.add(p);
        v.setSize(640, 480);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
    }

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(20);
                p.repaint();
            } catch(Exception e){}
        }
    }
}
