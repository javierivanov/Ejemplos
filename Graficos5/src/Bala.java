
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author javier
 */
public class Bala extends Thread{
    int x,y;
    Panel p;
    public Bala(int x, int y, Panel p) {
        this.x = x;
        this.y = y;
        this.p = p;
    }
    
    
    
    public void pintar(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x, y, 10, 10);
    }

    @Override
    public void run() {
        while (x <= 640){
            try{
                Thread.sleep(10);
            } catch(Exception e){}
            x++;
        }
        p.balitas.remove(this);
    }
    
    
    
}
