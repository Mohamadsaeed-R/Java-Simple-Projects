import java .util.*;
public class Project5 {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        float x;
        String ans;
        while(true){
            System.out.println("Enter  a number:");
            x=input.nextFloat();
            System.out.format("%f\t%f\t%f\n",x,Math.pow(x,2),Math.pow(x,3));
            System.out.println("do you want to continue?(y/n)");
            ans=input.next();
            ans=ans.toLowerCase();
            if(!ans.startsWith("y"))  break;
        }

    }
}
