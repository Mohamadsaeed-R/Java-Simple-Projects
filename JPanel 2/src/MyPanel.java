import javax.swing.JPanel;
import java.awt.Graphics;
public class MyPanel extends JPanel {
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        int n=20;
        int w=getWidth();
        int h=getHeight();
        int i ,j;
        for ( i =0;i<=n;i++){
            j=n-i;
            g.drawLine(i*w/n,0,0,j*h/n);
        }

    }
}
