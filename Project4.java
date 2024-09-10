import java.util.*;
public class Project4 {
        public static void main (String[]args){
        Scanner input=new Scanner (System.in);
            System.out.println("please enter a number:\n");
        double x= input.nextFloat();
        int counter=0;
        while(x>=1 && counter<=3) {
            System.out.format("%f\n" , x);
            x /= 2;
            counter ++;
        }
    }
}
