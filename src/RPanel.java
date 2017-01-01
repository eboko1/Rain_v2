import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vika on 01.01.2017.
 */
public class RPanel extends JPanel implements ActionListener {
    RLine rainLn = new RLine();
    //RainLine [] rlines =new RainLine[100];

    public RPanel(){
        Timer timer = new Timer(50,this);
        timer.start();
    }
    public void update(){
       /* for(int i=0;i<rlines.length;i++) {
            rlines[i].update();
        }*/
        rainLn.update();
    }
    public void paint(Graphics g){

        g.setColor(new Color(230,230,250));
        g.fillRect(0,0,640,360);
       /* for(int i=0;i<rlines.length;i++) {
            rlines[i].draw(g);
        }*/
        rainLn.draw(g);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }
}
