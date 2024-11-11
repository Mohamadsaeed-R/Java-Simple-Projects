import javax.swing.JOptionPane;
public class JOptionpane3 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter a number");
        int n = Integer.parseInt(name);
        String message;
        if(n%2==0){
            message="this is an even number";
        }
        else{
            message="this is a odd number";
        }
        JOptionPane.showMessageDialog(null,message);
    }
}