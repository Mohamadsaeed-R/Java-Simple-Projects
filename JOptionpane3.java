import javax.swing.JOptionPane;
public class JOptionpane3 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter a number");
        int n = Integer.parseInt(name); //This part of the code calls the parseInt method from the Integer class. This method converts a string (String) into an integer (int).
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
