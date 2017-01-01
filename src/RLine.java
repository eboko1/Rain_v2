import java.awt.*;

/**
 * Created by Vika on 01.01.2017.
 */
public class RLine {

    int x=0+(int)(Math.random()*250);
    int y=0;
    int ySpeed=1;


    public void update(){
        y=y+ySpeed;// + down  - up

    }
    public void draw(Graphics g){
        g.setColor(new Color (138,43,226));
        g.drawLine(x,y,x,y+25);


    }

}
