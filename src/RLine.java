import java.awt.*;

/**
 * Created by Vika on 01.01.2017.
 */
public class RLine {

    int x=0+(int)(Math.random()*650);
    int y=0+(int)(Math.random()*350);
    int ySpeed=0+(int)(Math.random()*10);
    int len =(int)(Math.random()*20);

    public RLine(int randX, int randY) {
    }


    public void update(){


        y=y+ySpeed;// + down  - up

    }
    public void draw(Graphics g){
        g.setColor(new Color (138,43,226));
        g.drawLine(x,y,x,y+len);


    }

}
