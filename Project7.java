public class Project7 {

    public static void main(String[] args) {
        int n =12345;
        System.out.format("the number is %d\n",n);
        System.out.format("the number is %08d\n",n);
        System.out.format("the number is %+8d\n",n);
        System.out.format("the number is %,d\n",n);
        System.out.format("the number is %,8d\n",n);
        System.out.format("the number is %-8d\n",n);

        double pi=Math.PI;
        System.out.format("pi=%f\n", pi);
        System.out.format("pi=%.2f\n", pi);
        System.out.format("pi=%-8.8f\n",pi);

    }

}