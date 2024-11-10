import javax.swing.JOptionPane;
public class JOptionpane2 {
    public static void main(String[] args) {
    String ans=JOptionPane.showInputDialog("What is your name?");
    String message =String.format("hi %s welcome to java",ans);
    JOptionPane.showMessageDialog(null,message);
    }
}