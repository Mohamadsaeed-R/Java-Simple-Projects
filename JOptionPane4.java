import javax.swing.JOptionPane;
public class JOptionPane4 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "please enter an integer:");
        int n=Integer.parseInt(name);
            if (n%2==0){
            JOptionPane.showMessageDialog(null, String.format("%d is an  even number",n));
            }else {
            JOptionPane.showMessageDialog(null,String.format("%d is an odd number",n));
            }
        JOptionPane.showMessageDialog(null, "Thank you","answer",JOptionPane.INFORMATION_MESSAGE);
    }
}
