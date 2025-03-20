import java.util.*;
public class DaysOfTheWeekWithSwitch{
    public static void main(String[] args) {
        System.out.println("enter a number from [1to7]:\n");
        Scanner input=new Scanner (System.in);
        int n= input.nextInt();
        String day="";
        String type="";
        switch(n) {
            case 1:
                day = "Saturday";
                type = "even";
                break;
            case 2:
                day = "Sunday";
                type = "odd";
                break;
            case 3:
                day = "Monday";
                type = "even";
                break;
            case 4:
                day = "Tuesday";
                type = "odd";
                break;
            case 5:
                day = "Wednesday";
                type = "even";
                break;
            case 6:
                day = "Thursday";
                type = "odd";
                break;
            case 7:
                day = "Friday";
                type = "is not even nor odd";
                break;
            default:{
                System.out.format("you have entered an invalid number\n ");
            }

        }
            if (!day.isEmpty()) {
                System.out.format("the day #%d is %s  .\n", n, day);
                System.out.format("%s is an %s day.\n", day, type);

            }
        }

    }
