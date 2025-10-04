import java.util.Scanner;
public class newapp {
    public static void main(String[] ans) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number:\n"); //جای این خط مهمه
        int n  = input.nextInt();
        int d=0;
        for (int i = 1; i <= n; i++) {            //int i = 1 یعنی از عدد ۱ شروع کن----
                //مهمه که حتمااینجوری بنویسم تا خود عدد رو هم شامل بشه تا کامل باشه i<= n
            if (n % i == 0) {                     //در واقع داره تمام عددهای ۱ تا n رو یکی‌یکی امتحان می‌کنه
                                                     //تا ببینه کدوم‌ها مقسوم‌علیه n هستن.
                System.out.format("%d\t\n", i);
                d++;
            }
        }System.out.format("number of divisors is: %d\n", d); //شمارش d باید بعد از اتمام حلقه چاپ بشه، نه داخل حلقه.
        if (d==2){
            System.out.format("%d is a prime number\n",n);
        }
    }

}
// دلیل این که چرا چاپ d باید بعد از حلقه باشه
//حلقه در حال شمارش است
//در هر دور از حلقه، متغیر d به تعداد مقسوم‌علیه‌های عدد n اضافه می‌شود.
//اگر شما مقدار d رو داخل حلقه چاپ کنی، در هر تکرار حلقه، مقدار d نمایش داده می‌شود که این باعث ایجاد خروجی اضافی می‌شود.
