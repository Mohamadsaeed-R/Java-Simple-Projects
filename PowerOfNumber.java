import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
     System.out.println("enter a number:\n");
     Scanner input=new Scanner (System.in);
     int n=input.nextInt();{
         System.out.format("%d \t%d\t%d\n",n,(int)Math.pow(n,2),(int)Math.pow(n,3));//Casting Int

     }
    }
}
