import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Vika on 01.01.2017.
 */
public class RPanel extends JPanel implements ActionListener {
    //RLine rainLn = new RLine();
    private ArrayList<RLine> rLine;
    //RainLine [] rlines =new RainLine[100];

    public RPanel(){
        Timer timer = new Timer(40,this);
        timer.start();
    }

    public void update(){
        rLine = new ArrayList<RLine>();
        //rainLn.update();

        for (int i=0;i<100;i++){
            Random rand = new Random();
            int randX = rand.nextInt(640);
            int randY = rand.nextInt(360);
         rLine.add(new RLine(randX,randY));
        }
        for (int i = 0;i<rLine.size();i++){
            rLine.get(i).update();
        }

    }

    public void paint(Graphics g){

        g.setColor(new Color(230,230,250));
        g.fillRect(0,0,640,360);

       for (int i=0;i<rLine.size();i++){
           rLine.get(i).draw(g);
       }
       // rainLn.draw(g);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }
}
