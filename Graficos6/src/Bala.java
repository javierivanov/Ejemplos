
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author javier
 */

public class Bala {
    int x,y,w,h;
    Panel p;
    public Bala(int x, int y, Panel p)
    {
        this.x = x;
        this.y = y;
        this.p = p;
        this.w = 20;
        this.h = 10;
    }
    
    
    public void pintar(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillRect(x, y, w, h);
    }
    
    public void disparar()
    {
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                while (x <= 640){
                    try{
                        Thread.sleep(200);
                    } catch(Exception e){}
                    x+=10;
                }
            }
        });
        t.start();
    }
    
}
