public class Salary {
    public static void main(String[] args) {
        long salary = 1000000;//برای اعداد بزرگتر از اینت از لانگ استفاده میکنند
        double tax ,netSalary;
        tax=salary*10/100;//می‌خواد ۱۰٪ از حقوق رو حساب کنه — یعنی «ده درصد از مبلغ کل»---(10درصد)
        netSalary = salary - tax;
        System.out.println("Net Salary is: "+netSalary);
        /*در جاوا وقتی + بین رشته (String) و هر چیز دیگه قرار بگیره
        جاوا اون چیز دوم رو تبدیل به رشته می‌کنه و دوتا رشته رو به هم وصل می‌کنه (concatenation)
        جمله‌ی "Net Salary is: " رو بگیر
            مقدار عددی netSalary رو هم تبدیل کن به متن
        بعد این دو تا رو بچسبون و چاپ کن.
     */
    }
}
