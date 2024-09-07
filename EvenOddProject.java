import java.util.*;
public class EvenOddProject {
        public static void main(String[]args){
            System.out.println("please enter an integer:\n");
            Scanner input =new Scanner(System.in); {
                int n =input.nextInt();

                if (n % 2==0) {
                    System.out.format("%d is an even number\n ",n);
                }
                else{
                    System.out.format("%d is an Odd number\n",n);

                }
            }
        }
}
