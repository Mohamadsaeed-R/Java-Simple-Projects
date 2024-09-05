import java.util.*;
public class DivisorsOfANumber {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter an integer:") ;
        int n=input.nextInt();
            System.out.format("Divisors of a number %d\n",n);
        int d = 0;
        for(int i = 1 ; i<=n ; i++){
            if (n % i==0)
            {
                System.out.format("%d\n",i);
                d++;
            }
        }

        System.out.format("Divisors of the number %d:\n",d);
        if (d==2){
            System.out.format("%d is a prime number \n ",n);
        }
        else {
            System.out.format("%d is not a prime number \n ",n);
        }

    }
}
