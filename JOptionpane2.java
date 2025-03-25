import javax.swing.JOptionPane;
public class joptionpane {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog(null,"hi enter your name :","my app",JOptionPane.INFORMATION_MESSAGE);
        String message=String.format("welcome to my app %s",name);
        JOptionPane.showMessageDialog(null,message);
    }
}
