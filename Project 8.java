import java.util.*;
public class newapp {
    public static void main(String []args){
        System.out.println("enter a float number mate:\n");
        Scanner input=new Scanner (System.in);
        double x= input.nextFloat();
        int counter=0;
        int  counter_max= 3 ;
        do{
            System.out.format("%f \n",x);
            x/=2;
            counter++;
        }while (counter <= counter_max );

    }


}