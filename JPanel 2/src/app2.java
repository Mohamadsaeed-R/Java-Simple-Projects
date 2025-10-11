import javax.swing.*;
import java.awt.Graphics;
public class app2 {
    public static void main(String[]args){
        MyPanel panel =new MyPanel();
        JFrame app= new JFrame();
        app.add(panel);
        app.setTitle("My App");
        app.setSize(500,500);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
