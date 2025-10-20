public class RemainderAndBooleanExample {
    public static void main (String[]args){
        double MyFirstVariable = 20.00;
        double MySecondVariable = 80.00;
        double MyValueTotal = MyFirstVariable + MySecondVariable *100;
        System.out.println("My Value Total "+MyValueTotal);
        double TheRemainder=MyValueTotal % 40;
        System.out.println("The Remainder is "+TheRemainder);
        boolean IsNoRemainder=(TheRemainder==0)?true:false;
        System.out.println("The Remainder is "+IsNoRemainder);
        if(!IsNoRemainder){
            System.out.println("Got Some remainder");
        }
    }
}
