import java.util.*;
public class Project3 {
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);// ساخت شیء Scanner -- یعنی یک شیء برای دریافت ورودی از کاربر ایجاد کن     
            System.out.println("please enter an integer:\n");
            int n=input.nextInt() ;
            String Type=(n % 2 == 0)? "Even":"odd";
            System.out.format("%d is an %s number",n,Type);

    }
}
