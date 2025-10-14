import java.util.*;
public class DiceSimulator {
    public static void main(String[] args){
        Random rnd=new Random();//برای تولید اعداد تصادفی
        int n=1000;//تعداد
        int n1=0;
        int n2=0;
        int n3=0;
        int n4=0;
        int n5=0;
        int n6=0;
        int k; //نتیجه پرتاب هر تاس رو نگه میداره
        for(int i=0;i<n;i++){
            k=rnd.nextInt(6)+1;//چون اگر 1 نگذاریم 1تا 5 رامحاسبه میکند
            switch(k){
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:
                    n3++;
                    break;
                case 4:
                    n4++;
                    break;
                case 5:
                    n5++;
                    break;
                case 6:
                    n6++;
                    break;

                }
            }
            double p1= (double) n1/n;
            double p2= (double) n2/n;
            double p3= (double) n3/n;
            double p4= (double) n4/n;
            double p5= (double) n5/n;
            double p6= (double) n6/n;
            System.out.format("Results of rolling dice %d times\n",n);
            System.out.format("p1=%d/%d=%.2f%%\n",n1,n,100*p1);
            System.out.format("p2=%d/%d=%.2f%%\n",n2,n,100*p2);
            System.out.format("p3=%d/%d=%.2f%%\n",n3,n,100*p3);
            System.out.format("p4=%d/%d=%.2f%%\n",n4,n,100*p4);
            System.out.format("p5=%d/%d=%.2f%%\n",n5,n,100*p5);
            System.out.format("p6=%d/%d=%.2f%%\n",n6,n,100*p6);//ولی چون تصادفیه، در عمل کمی عدد نهایی ممکنه بالا و پایین می‌شه


        }

    }

