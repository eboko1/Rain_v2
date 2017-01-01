import javax.swing.*;


/**
 * Created by Vika on 01.01.2017.
 */
public class RMain extends JFrame {
    public final int WIDTH=640;
    public final int HEIGHT=360;

    public RMain (){
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        add(new RPanel());
    }
    public static void main (String[] args) {
        new RMain();
    }

}
